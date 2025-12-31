
public class overloadedMethods {
    public static void main(String[] args) {
        //overloaded methods, methods with the same name 
        // but different params
        
        //summ for 2 elements
        System.out.println("result for 2 elements is: "+add(1,2));
        System.out.println("result for 3 elements is: "+add(1,2,3));

        //summ for 3 elements

    }

    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
