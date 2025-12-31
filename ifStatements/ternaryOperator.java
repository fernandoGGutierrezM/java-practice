public class ternaryOperator {
    public static void main(String[] args) {
        //ternary operator is a ?, used to evaluate if a condition is true
        //simple version of if statement 

        int pastBalance = -100;
        int currBalance = 200;

        //if balance is positive return BLACK, if not return RED

        System.out.println("PAST( BALANCE: ");
        // <var type> <var name> = (<comparison>) ? <true output>:<false output>;
        String balance = (pastBalance>=0) ? "BLACK": "RED";
        System.out.println(balance);
        System.out.println("CURRENT BALANCE: ");
        balance = (currBalance>=0) ? "BLACK": "RED";
        System.out.println(balance);
    }
}
/*
operators:
    greater:     >
    great or eq: >=
    smaller:     <
    small or eq: <=
    equal:       ==
    different:   !=
    AND:         &&
    OR:          ||
    not:         !
    bool XOR:    &
    bool NOR:    |


*/