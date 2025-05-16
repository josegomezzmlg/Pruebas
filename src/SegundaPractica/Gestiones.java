package SegundaPractica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gestiones {
    private final ArrayList<Clase> listaClases;
    Map<String,Alumnos> listaAlumnos= new HashMap<String,Alumnos>();
    Map<String,Profesor> listaProfesores = new HashMap<String,Profesor>();
    private final Scanner teclado;

    public Gestiones() {
        this.listaClases = new ArrayList<>();
        this.teclado = new Scanner(System.in);
    }

    private Clase buscarClase(String codigo) {
        for (Clase c : listaClases) {
            if (c.getCodClase().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    private Alumnos buscarAlumno(Clase clase, String codigoAlumno) {
        for (Alumnos a : clase.getAlumnos()) {
            if (a.getCodAlumno().equalsIgnoreCase(codigoAlumno)) {
                return a;
            }
        }
        return null;
    }

    public void CrearClase() {
        System.out.println("Introduce el código de la clase: ");
        String codclase = teclado.next();
        Clase clase = new Clase(codclase);
        listaClases.add(clase);
        System.out.println("Clase agregada con éxito.");
    }

    public void mostrarClases() {
        for (Clase c : listaClases) {
            System.out.println("Código de clase: " + c.getCodClase());
            System.out.println("Alumnos:");
            for (Alumnos alumno : c.getAlumnos()) {
                System.out.println(" - " + alumno);
            }
            System.out.println();
        }
    }

    public void crearAlumno() {
        try {
            System.out.println("Introduce el nombre del alumno: ");
            String nombre = teclado.nextLine();
            System.out.println("Introduce el apellido del alumno: ");
            String apellido = teclado.nextLine();
            System.out.println("Introduce la edad del alumno: ");
            int edad = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce el código del alumno: ");
            String codigo = teclado.next();

            if (codigo.startsWith("A")) {
                System.out.println("Introduce el código de la clase a la que va el alumno: ");
                String codClase = teclado.next();

                Clase clase = buscarClase(codClase);
                if (clase != null) {
                    Alumnos alumno = new Alumnos(nombre, apellido, edad, codigo, codClase);
                    clase.agregarAlumno(alumno);
                    if (!listaAlumnos.containsKey(alumno.getCodAlumno())) {
                        listaAlumnos.put(alumno.getCodAlumno(), alumno);
                    } else {
                        System.out.println("Ese código ya existe.");
                    }
                    System.out.println("Alumno agregado a la clase " + codClase);
                    mostrarInformacionClase(codClase);
                } else {
                    System.out.println("No existe la clase " + codClase);
                }
            } else {
                System.out.println("El código del alumno debe empezar por 'A'");
            }
        } catch (Exception e) {
            System.out.println("Error al introducir datos del alumno. Recuerda que la edad debe ser un numero.");
            teclado.nextLine();
        }
    }


    public void crearProfesor() {
        try {
            System.out.println("Introduce el nombre del profesor: ");
            String nombre = teclado.nextLine();
            System.out.println("Introduce el apellido del profesor: ");
            String apellido = teclado.nextLine();
            System.out.println("Introduce la edad del profesor: ");
            int edad = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce el código del profesor: ");
            String codigo = teclado.next();

            if (codigo.startsWith("P")) {
                System.out.println("Introduce el código de la clase del profesor: ");
                String codClase = teclado.next();
                Profesor profesor = new Profesor(nombre, apellido, edad, codigo, codClase);
                Clase clase = buscarClase(codClase);
                if (clase != null) {
                    clase.setProfesor(codigo);
                    if (!listaProfesores.containsKey(profesor.getCodProf())) {
                        listaProfesores.put(profesor.getCodProf(),profesor);
                    } else {
                        System.out.println("Ese código ya existe.");
                    }
                    System.out.println("Profesor agregado a la clase " + codClase);
                    mostrarInformacionClase(codClase);
                } else {
                    System.out.println("No existe la clase " + codClase);
                }
            } else {
                System.out.println("El código del profesor debe empezar por 'P'");
            }
        } catch (Exception e) {
            System.out.println("Error al introducir datos del profesor. Recuerda que la edad debe ser un numero.");
            teclado.nextLine();
        }

    }


    public void mostrarInformacionClase(String codClase) {
        Clase clase = buscarClase(codClase);
        if (clase != null) {
            if (clase.getProfesor() != null) {
                String profesor = clase.getProfesor();

                for (Map.Entry<String, Profesor> entry : listaProfesores.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(profesor)) {
                        String nombre = entry.getValue().getNombre();
                        System.out.println("El profesor de esta clase es " +nombre);
                        break;
                    }
                }

                if (clase.getAlumnos() != null) {
                    System.out.println("La clase " + codClase + " tiene como alumnos:");
                    for (Alumnos alumnos : clase.getAlumnos()) {
                        System.out.println(" - " + alumnos);
                }
                }
            }else System.out.println("La clase no tiene ningun profesor asignado");

        } else {
            System.out.println("No existe la clase " + codClase);
        }
    }

    public void ponerNotas() {
        try {
            System.out.println("Introduce la clase: ");
            String codClase = teclado.next();
            Clase clase = buscarClase(codClase);

            if (clase == null) {
                System.out.println("No existe la clase " + codClase);
                return;
            }

            System.out.println("¿Cuál es su código de profesor?: ");
            String codProfesor = teclado.next();

            if (!clase.getProfesor().equalsIgnoreCase(codProfesor)) {
                System.out.println("El código de profesor no corresponde a esta clase");
                return;
            }

            System.out.println("Introduce el código del alumno: ");
            String codAlumno = teclado.next();
            Alumnos alumno = buscarAlumno(clase, codAlumno);

            if (alumno != null) {
                Alumnos alumnos = listaAlumnos.get(codAlumno);
                System.out.println("Introduce la nota que le quieres poner al alumno " + alumnos.getNombre());
                double nota = teclado.nextDouble();
                teclado.nextLine();
                alumno.setNota(nota);
                System.out.println("Se ha asignado la nota correctamente al alumno " +alumnos.getNombre());
                hablarProfesor(codProfesor, nota);
                hablarAlumno(codAlumno, nota);
            } else {
                System.out.println("No existe el alumno " + codAlumno + " en esta clase");
            }
        } catch (Exception e) {
            System.out.println("Error al introducir datos. Asegúrate de que la nota sea un número.");
            teclado.nextLine();
        }
    }


    public String hablarProfesor(String codigo,double nota) {
        Profesor profesor = listaProfesores.get(codigo);
        if (codigo.startsWith("P")) {
            System.out.println("Hola soy el profesor "+ profesor.getNombre() +" y te he puesto un "+nota);
            return "Poniendo notas";
        } else {
            System.out.println("Yo no he puesto ninguna nota hoy :-) ");
            return "No puede poner notas";
        }
    }

    public String hablarAlumno(String codigo,double nota) {
        Alumnos alumnos = listaAlumnos.get(codigo);
        if (codigo.startsWith("A")) {
            if (nota < 5) {
                System.out.println(alumnos.getNombre() + ": Me ha faltado mucho para alcanzar los conocimientos, en el proximo lo hare mejor.");
            } else if (nota < 7) {
                System.out.println(alumnos.getNombre() + ": No está mal, pero podría ser mejor, prometo mejorar");
            } else if (nota < 9) {
                System.out.println(alumnos.getNombre() + ": Estoy contento con mi resultado, me he esforzado mucho");
            } else {
                System.out.println(alumnos.getNombre() + ": ¡SÍÍÍ! ¡¡Un sobresaliente!!");
            }
            return "Aceptando nota";
        } else {
            System.out.println("No me han puesto ninguna nota ");
            return "No me han puesto ninguna nota";
        }
    }
}




