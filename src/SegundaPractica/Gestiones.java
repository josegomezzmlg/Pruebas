package SegundaPractica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestiones {
   private ArrayList<Clase> listaClases;

    public Gestiones() {
        this.listaClases = new ArrayList<>();
    }

    public void CrearClase() {
        Scanner teclado = new Scanner(System.in);
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
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = teclado.next();
        System.out.println("Introduce el apellido del alumno: ");
        String apellido = teclado.next();
        System.out.println("Introduce el edad del alumno: ");
        int edad = teclado.nextInt();
        System.out.println("Introduce el codigo del alumno: ");
        String codigo = teclado.next();
        System.out.println("Introduce el codigo de la clase a la que va el alumno");
        String clase = teclado.next();

        Alumnos alumno = new Alumnos(nombre, apellido, edad, codigo, clase);

        for (Clase c : listaClases) {
            if (c.getCodClase().equalsIgnoreCase(clase)) {
                c.agregarAlumno(alumno);
                System.out.println("Alumno agregado a la clase " + clase);
                break;
            }else System.out.println("No existe la clase " + clase);
        }
        mostrarInformacionClase(clase);
    }

    public void crearProfesor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del Profesor: ");
        String nombre = teclado.next();
        System.out.println("Introduce el apellido del Profesor: ");
        String apellido = teclado.next();
        System.out.println("Introduce el edad del Profesor: ");
        int edad = teclado.nextInt();
        System.out.println("Introduce el codigo del Profesor: ");
        String codigo = teclado.next();
        System.out.println("Introduce el codigo de la clase del profesor: ");
        String clase = teclado.next();

       new Profesor(nombre, apellido, edad, codigo, clase);

        for (Clase c : listaClases) {
            if (c.getCodClase().equalsIgnoreCase(clase)) {
                c.setProfesor(codigo);
                System.out.println("Profesor agregado a la clase " + clase);
                break;
            }else System.out.println("No existe la clase " + clase);
        }
        mostrarInformacionClase(clase);
    }

    public void mostrarInformacionClase(String clase) {
        for (Clase c : listaClases) {
            if (c.getCodClase().equalsIgnoreCase(clase)) {
                System.out.println("El profesor de esta clase es "+c.getProfesor());
                System.out.println(" La clase "+clase+" tiene como alumnos: ");
                for (Alumnos alumnos : c.getAlumnos()) {
                    System.out.println(" - " + alumnos );
                }

            }
        }
    }

    public void ponerNotas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la clase: ");
        String clase = teclado.next();
        for (Clase c : listaClases) {
            if (c.getCodClase().equalsIgnoreCase(clase)) {
                System.out.println("Cual es su codigo de profesor: ");
                String codigo = teclado.next();
                if(c.getProfesor().equalsIgnoreCase(codigo)){
                    System.out.println("Introduzca el codigo del alumno: ");
                    String alumno = teclado.next();
                    for(Alumnos alumnos : c.getAlumnos()){
                        if (alumnos.getCodAlumno().equalsIgnoreCase(alumno)){
                            System.out.println("Introduca la nota que le quieres poner al alumno "+alumno);
                            double nota = teclado.nextDouble();
                            alumnos.setNota(nota);
                            System.out.println("Se le ha asignado la nota al alumno "+alumno+" de manera correcta");
                        }else  System.out.println("No existe el alumno "+alumno+ " en esta clase");
                    }
                }else System.out.println("El codigo de profesor no corresponde a esta clase");
            }else System.out.println("No existe la clase " + clase);

        }
    }






    }


