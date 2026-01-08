
public class Main {
    public static void main(String[] args) {
        //overloaded constructors = allow class to 
        user user1 = new user("pepeeee");
        user user2 = new user("pablo", "pablo@gmail.com",12);
        user user3 = new user();

        System.out.println("user 1 name: "+user1.username);
        System.out.println("user 2 email: "+user2.email);
        System.out.println("user 3 name: "+user3.username);
    }
    
}
