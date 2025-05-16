package SegundaPractica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gestiones gestiones = new Gestiones();

        int opcion;
        while (true) {
            System.out.println("1. Crear clase");
            System.out.println("2. Crear alumno");
            System.out.println("3. Crear profesor");
            System.out.println("4. Generar notas");
            System.out.println("5. Mostrar toda la informacion");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                  gestiones.CrearClase();
                  gestiones.mostrarClases();
                  break;
                  case 2:
                      System.out.println("ATENCION -- El codigo de los alumnos siempre debe empezar por 'A'");
                      gestiones.crearAlumno();
                      break;
                      case 3:
                          System.out.println("ATENCION -- El codigo de los profesores siempre debe empezar por 'P'");
                          gestiones.crearProfesor();
                          break;
                          case 4:
                              gestiones.ponerNotas();
                              break;
                              case 5:
                                  System.out.println("Introduce el codigo de la clase: ");
                                  String codigo = sc.next();
                                  gestiones.mostrarInformacionClase(codigo);
                                  break;
                                  case 6:
                                      break;
            }
        }



    }
}
