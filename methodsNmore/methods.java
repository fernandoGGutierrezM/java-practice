
public class methods {
    public static void main(String[] args) {
        
        //method is a block of reusable code excecuted when called.
        
        chelas();
        chelas();
        chelas();

        chelasPersonal("jorge");
        chelasPersonal("pepe");

    }

    //if we call a method from static, it must be static as well.
    //also remember about methods
    static void chelas(){
        System.out.println("Saquen las chelas siu");
        System.out.println("saquen las friass siiu");
    }

    static void chelasPersonal(String nombre){
        System.out.println("cuantas chelas quieres "+nombre);
        System.out.println("con gusto "+nombre+" te las sirvo");
    }
}
