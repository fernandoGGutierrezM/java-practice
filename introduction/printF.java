
public class printF {

    public static void main(String[] args){
        //printf can be useful to print with different formats

        String name = "Jake";
        
        int age = 23;
        double weight = 59.4;


        System.out.printf("Hello %s \n ", name);
        System.out.printf("your weigt is %f kg and your age is %d years old", weight, age);

        //for precision

        double price1 = 9.99;
        double price2 = 100.45;

        System.out.printf("%n price 1 is: %.1f with one decimal and price 2 is: %.3f with 3 decimals", price1, price2);
        // adding the .<desired decimals> you are setting the precision you want

    }
}
    /*
    It is possible to set a certain precision for decimals after pt

    specifiers are:
    String _______ %s
    Integer ______ %d
    float ________ %f
    char _________ %c
    bool _________ %b
    hexa _________ %x
    newline ______ %n
    percent sign _ %%
    */
   
    

    

