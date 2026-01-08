
public class Main {
    public static void main(String[] args) {
        cat zoe = new cat();
        dog koba = new dog();
    
        System.out.println("vidas gato: "+zoe.lives+" perro: "+koba.lives);
        
        plant planta = new plant();

        System.out.println("planta: "+planta.isAlive);
        planta.synthesis();
        //mientras no hereden no van a tener los atributos de otra clase
    }

    
}
