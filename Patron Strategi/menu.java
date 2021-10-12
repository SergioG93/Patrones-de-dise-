import java.util.Scanner;
import java.util.*;


class Menu
{
public static void main(String[] args)
{
int opciones;
Scanner leer = new Scanner(System.in);
Opcion1 op1=null;
Opcion2 op2=null;
Opcion3 op3=null;
 
System.out.println("Menu por consola");
System.out.println("1.- Opcion1");
System.out.println("2.- Opcion2");
System.out.println("3.- Opcion3");
System.out.println("Comandos: ") //Pretendo que el usuario escriba el numero de  opcion
opciones=leer.nexInt();
 
switch(opciones) {
case 1: 
op1=new Opcion1();
op1.ejecutaMetodo();
break;
 
case 2:
op2=new Opcion2();
op2.ejecutaMetodo();
String variable = op1.variableOpcion1;
break;
 
case 3: 
op3=new Opcion3();
op3.ejecutaMetodo();
break;
}
}
}
