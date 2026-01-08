public class friend {
    String name;
    //int nFriends;
    static int nFriends;

    friend(String name){
        this.name=name;
        nFriends++;
    }

    static void showFriends(){
        System.out.println("you've: "+nFriends+"friends");
    }

    
}
