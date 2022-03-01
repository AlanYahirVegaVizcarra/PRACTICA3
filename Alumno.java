import java.util.Scanner;
import java.util.Vector;

/* Aqui se instancia la clase */
public class Alumno{
    public static void main(String[] args) {

        Alumno2 captura = new Alumno2();

        Vector<Alumno2> registroAlumno2 = new Vector<>();

        Scanner sc = new Scanner(System.in);

        char opc = ' ';
/* Alumnos registrados por defecto */
        registroAlumno2.add(new Alumno2("0", "Alan", "Programacion", 89));
        registroAlumno2.add(new Alumno2("1", "Donovan", "Algebra", 45));
        registroAlumno2.add(new Alumno2("2", "Yahir", "Mecanica", 74));
        registroAlumno2.add(new Alumno2("3", "Byron", "Historia", 99));
        registroAlumno2.add(new Alumno2("4", "Christian", "Matematicas", 60));

        do {

            System.out.println("Menú");
            System.out.println("Ingrese la opcion que desea(1-3)");
            System.out.println(" 1. Capturar Alumnos");
            System.out.println(" 2. Mostrar Alumnos");
            System.out.println(" 3. Salir");

            opc = sc.next().charAt(0);
/* Opciones del menu */
            switch(opc) {
                case '1':
                    captura.asignarName(sc);
                    registroAlumno2.add(captura);
                    break;

                case '2':
                    registroAlumno2.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    break;

                case '3':
                    System.out.println("Aqui acaba el programa, gracias.");
                    break;

                default:
                    break;
            }

        } while (opc != '3');
    }

}
