import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        
        System.out.println("Hello: " + name);
        

        String response = "";

        while(!response.equals("Q")){
            System.out.println("you are playing now ... ");
            System.out.print("PRESS Q TO QUIT: ");
            response = scanner.next();
        }
        System.out.println("YOU QUITED");

        //do while loop will always run at least once
        //you do the things first and check condition in the end
        int age = 0;
        do{
            System.out.println("YOUR AGE CANNOT BE NEGATIVE: ");
            System.out.print("enter ur age: ");
            age = scanner.nextInt();
        }while(age<0);

        System.out.println("you are: " + age);

        scanner.close();
    }
}
