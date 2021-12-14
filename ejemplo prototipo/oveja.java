public class oveja implements Animal {

    public oveja(){

        System.out.println("Se hizo una oveja");
    }

    public Animal makeCopy(){

        System.out.println("Se hizo una copia de la oveja");

        oveja ovejaObject=null;

        try {

            ovejaObject = (oveja) super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("No se realizo");
            e.printStackTrace();
        }

        return ovejaObject;
    }

    public String toString(){

        return "Soy una oveja baaaah";
    }
}