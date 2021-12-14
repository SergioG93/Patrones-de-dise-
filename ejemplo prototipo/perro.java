public class perro implements Animal {

    public perro(){

        System.out.println("Se hizo un perro");
    }

    public Animal makeCopy(){

        System.out.println("Se hizo una copia del perro");

        perro perroObject=null;

        try {

            perroObject = (perro) super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("No se realizo");
            e.printStackTrace();
        }

        return perroObject;
    }

    public String toString(){

        return "Soy un perro wuaf wuaf";
    }
}