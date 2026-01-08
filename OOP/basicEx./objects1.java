

public class objects1 {
    public static void main(String[] args) {
        //object -> entity that holds data (attributes)
        //  they can perform actions (methods)
        //  you can create varios versions of objects (instances)

        bike bicicle = new bike();

        System.out.println(bicicle.make);
        System.out.println("current year is: "+bicicle.year);
        bicicle.changeYear();
        System.out.println("updated year is: "+bicicle.year);

    }
    
}
