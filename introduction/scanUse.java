
import java.util.Scanner;

public class scanUse {
    public static void main(String[] args){
        //Scanner with cap is the keyword and scanner is the name of this scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("como tu te llama: ");
        String name = scanner.nextLine();
        System.out.print(name+" plebe "+ "cuale e tu chela favorita?: ");
        String chela = scanner.nextLine();
        System.out.print("cuanta kiere de "+chela+" ???");
        int cuantas = scanner.nextInt();
        System.out.println(name+" con gusto le traigo "+ cuantas + " De las " + chela);
        
        //there are scanner.next<variable> 
        //there are multiple variables for you to put at the scanner
        
        scanner.close();
    }
    
}

/*
one possible flaw is for the scanner to jump a line if you are asking for a string
after an int input:
    System.out.println("enter age: ");
    int age = scanner.nextInt()
    System.out.println("favorite color: ");
    String color = scanner.nextLine();
    
    -- THIS WOULD MAKE THE PROGRAM TO DISPLAY A JUMP IN THE LINE
    Sooo, we should do this in order to solve it

    System.out.println("enter age: ");
    int age = scanner.nextInt()
    scanner.nextLine(); <-- this line
    
    System.out.println("favorite color: ");
    String color = scanner.nextLine();

*/