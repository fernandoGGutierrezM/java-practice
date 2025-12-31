
public class enhancedSwitch {
    public static void main(String[] args) {
        // enhanced switch = a replacement to many else if statements
        // it is a java 14 feature (basically what it says it is, a switch, but enhanced)
    
        String day = "sat";

        switch (day) {
            case "mon", "tue", "wed", "thu", "fri" -> System.out.println("WEEKDAY");
            case "sat", "sun" -> System.out.println("WEEKEND");
            default -> System.out.println("NOT A WEEKDAY");
        }
        //you can enhance the use of switches, so there's no need to make endelss switches for
        //repeated cases
    }
}
