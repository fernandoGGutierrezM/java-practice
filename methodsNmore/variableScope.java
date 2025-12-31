
public class variableScope {

    //static int x = 3; //class variables
    public static void main(String[] args) {
        int x=1; //this is a local variable

        
    }

    static void doSomething(){
        int x=2; //local variable (from do something)
    }
}


//you can have variables with
//the same name but in different methods