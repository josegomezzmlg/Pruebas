package SegundaPractica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gestiones gestiones = new Gestiones();

        int opcion;
        while (true) {
            System.out.println("1. Crear profesor");
            System.out.println("2. Crear alumno");
            System.out.println("3. Crear clase");
            System.out.println("5. Generar notas");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                  gestiones.CrearClase();
                  gestiones.mostrarClases();

            }
        }



    }
}
