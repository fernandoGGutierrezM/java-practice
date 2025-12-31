import java.util.Scanner;

public class bankingProgram {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;
    public static void main(String[] args) {
        
        boolean runProgram = true;
        

        while(runProgram){
            System.out.println("***************");
            System.out.println("Banking program: ");
            System.out.println("***************");
            System.out.println("1. show balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. exit");
            System.out.println("***************");

            System.out.print("enter your choice: ");
            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    showBalance();
                    continue;
                case 2:
                    deposit();
                    continue;
                case 3: 
                    withdraw();
                    continue;
                case 4:
                    runProgram=false;
                    break;
                    
                default:
                    System.out.println(" UNRECOGNIZED OPERATION");
            }
            
        }
        scanner.close();

    }

    static void showBalance(){
        System.out.println("Your current balance is: "+balance);
    }

    static void deposit(){
        System.out.println("how much would you like to deposit: ");
        double amount;
        amount = scanner.nextDouble();
        balance+=amount;
        System.out.println("Current balance is: "+balance);
    }

    static void withdraw(){
        System.out.println("How much would you like to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount>balance){
            System.out.println("NOT ENOUGH FUNDS");
        }
        else{
            balance -= amount;
            System.out.println("Current balance is: "+balance);
        }
    }
}
