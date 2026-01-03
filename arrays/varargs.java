
public class varargs {
    public static void main(String[] args) {
        //variable arguments
        //varargs allow a method to accept a varying number
        //of arguments without having to declare many times 
        //the argument options
        System.out.println(add(1,2,3,4));

        System.out.println(average(10,10,9));
        System.out.println(average(10,10,9,7,10));
    }

    //now we can use this and pass several different overloaded methods
    static int add(int... numbers){
        int summ=0;

        for (int number:numbers){
            summ+=number;
        }

        return summ;
    }

    static double average(double... numbers){
        double summ=0;
        for(double number:numbers){
            summ+=number;
        }
        return summ/numbers.length;
    }
    
    
}
