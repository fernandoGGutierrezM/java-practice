

//tatic makes a variable or method belong to the class rathern than to any
//specific object. commonly used for utility methods or shared resources

public class Main {
    public static void main(String[] args) {
        friend pepe = new friend("jose");
        System.out.println("number: "+friend.nFriends);
        friend arturo = new friend("r2d2");
        System.out.println("number: "+arturo.nFriends);
        System.out.println("number: "+friend.nFriends);
        //as if the class owns a certain element 
        //you can also use it in methods
        //now the class owns it not only an object
        friend.showFriends();
        
    }
    
}
