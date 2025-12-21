import java.util.Random;;

public class randomN {

    public static void main(String[] args){
        Random random = new Random();
        
        boolean moneda;

        moneda = random.nextBoolean();
        // for a random number use instead:
        //numero = random.nextInt();
        //numero = random.nextFloat();


        if (moneda){
            System.out.println("SELLO");
        }
        else{
            System.out.println("AGUILA");
        }
    
    }
    
}
