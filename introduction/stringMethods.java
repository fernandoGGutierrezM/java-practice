
public class stringMethods {
    public static void main(String[] args) {
        String name = "Fernando";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("r");
        int lastindex = name.lastIndexOf(name);

        //name = name.toUpperCase();
        //name = name.toLowerCase();

        //name = name.trim();
        //name = name.replace("a", "o");

        if(name.isEmpty()){
            System.out.println("string is empty!!! ");
        }
        else{
            System.out.println("UR NAME IS: "+name);
        }

        // -- SUBSTRINGS --
        //.substring() is a method used to extract a portion of a sintrg
        // .substring(start, end)
        
        String email = "fernandog@gmail.com";
        String domain = email.substring(9,18);
        //get the domain automatically using another method to find the @ in the address.
        String autoIndex = email.substring(email.indexOf("@")+1);

        System.out.println("domain is: "+domain+ " auto domain is: "+ autoIndex);



    }
}
