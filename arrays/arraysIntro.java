import java.lang.reflect.Array;
import java.util.Arrays;

//it is not neccesary to import arrays lib if you don't use specific methds of it

public class arraysIntro {
    public static void main(String[] args) {
        String[] operations = {"check balance", "sell stock", "add money"};
        Integer[] checks = {1,2,2,3};

        //change 3rd index of checks to 5
        checks[2]=5;
        System.out.println(operations[1]);
        System.out.println(checks[2]);
        
        //get length of array
        int checksSize = checks.length;

        for(int i=0; i<checksSize; i++){
            System.out.println(checks[i]);
        }

        //this is the other way to use the for loop in arrays
        System.out.println("ENHANCED FOR (FOR EACH)");
        for (String operation:operations){
            System.out.println(operation);
        }

        //sorting 
        Arrays.sort(checks);
        for (Integer num:checks){
            System.out.println("check: "+num);
        }

    }
}
