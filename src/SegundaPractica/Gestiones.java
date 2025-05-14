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
        Clase clase = new Clase(codclase);  // Clase sin alumnos
        listaClases.add(clase);
        System.out.println("Clase agregada con éxito.");
    }

    public void mostrarClases() {
        for (Clase c : listaClases) {
            System.out.println("Código de clase: " + c.getCodClase());
            System.out.println("Alumnos:");
            for (Alumno alumno : c.getAlumnos()) {
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

    }




    }


}
