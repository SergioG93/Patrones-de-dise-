public class TestCloning {

    public static void main (String[] args){

        CloneFactory animalMaker = new CloneFactory();

        perro rocky = new perro();

        oveja betty = new oveja();


        perro clonePerro = (perro) animalMaker.getClone(rocky);

        oveja cloneOveja = (oveja) animalMaker.getClone(betty);


        System.out.println(rocky);

        System.out.println(betty);

        System.out.println(clonePerro);

        System.out.println(cloneOveja);


        System.out.println("Rocky numero....." + System.identityHashCode(System.identityHashCode(rocky)));

        System.out.println("Clon identificador....." + System.identityHashCode(System.identityHashCode(clonePerro)));

        System.out.println("Betty numero....." + System.identityHashCode(System.identityHashCode(betty)));

        System.out.println("Clon identificador......" + System.identityHashCode(System.identityHashCode(cloneOveja)));
    }
    
}
