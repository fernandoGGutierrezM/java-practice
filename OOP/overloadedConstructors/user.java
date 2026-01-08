

public class user {
    String username;
    String email;
    int userNum;

    user(){
        this.username = "temporary";
        this.email = "notProvided";
        this.userNum = 0;
    }
    user(String username){
        this.username = username;
        this.email = "notProvided";
        this.userNum = 0;
    }
    user(String username, String email, int userNum){
        this.username = username;
        this.email = email;
        this.userNum = userNum;
    }
}
