import java.util.Scanner;
import java.util.InputMismatchException;

public class Maquinadecafe
{

 public static void main( String[] args){

    Scanner sn = new Scanner(System.in);
    boolean salir = false;
    int opcion; //Guardaremos la opcion del usuario

    while (!salir) {
 
        System.out.println("1. Opcion 1 - Te");
        System.out.println("2. Opcion 2 - Cafe");
        System.out.println("3. Salir");

        try {
            System.out.println("SERGIO ALBERTO GARZA AGUILAR--------PRACTICA");

 
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Te caliente");
                    System.out.println("Metodo de preparacion\n");
                    Template te = new TeCaliente();
                    te.prepararBebida();
                    break;
                case 2:
                    System.out.println("Has seleccionado Cafe");
                    System.out.println("Metodo de preparacion\n");
                    Template cafe = new Cafecito();
                    cafe.prepararBebida();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo opciones entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes seleccionar");
                sn.next();
            }
        }
 
    }

 
}

