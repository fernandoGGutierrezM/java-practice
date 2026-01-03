import java.util.Scanner;
import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {
        
        //creating an empty array:
        String[] instrumentTypes = new String[3];

        instrumentTypes[0]="ETFs";
        instrumentTypes[1]="Bonds";
        instrumentTypes[2]="Stock";

        for (String instrument:instrumentTypes){
            System.out.println(instrument);
        }

        Scanner scanner = new Scanner(System.in);
        
        //with this you initialize empty array
        String[] foods = new String[3];

        //fill array with input
        for (int i=0;i<foods.length;i++){
            System.out.println("What'd u like: ");
            foods[i]=scanner.nextLine();
        }

        for (String food:foods){
            System.out.println(food);
        }
        scanner.close();
    }    
}
