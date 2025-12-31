
public class ifStatements {

    public static void main(String[] args){
        int age = 17;

        if (age >= 18){
            System.out.println("adelante mi rey");
        }
        else if (age <0){
            System.out.println("no mame rey esta edad es fake");
        }
        else{
            System.out.println("sorry mi rey no pasa");
        }

        //nested if statements
        System.out.println("------ NESTED IF STATEMENTS ------");
        boolean minor = false;
        boolean member = false;
        int price = 100;
        if (minor){
            if(member){
                price *= 0.2;
                System.out.println("you are member and a minor, you pay only: "+price);
            }
            else{
                price *= 0.5;
                System.out.println("you minor, then u pay: " + price);
            }
        }
        else{
            if(member){
                price *= 0.7;
                System.out.println("You are member you pay : " + price);
            }
            System.out.println("You are no member adult you rubbish pay full price: "+price);

        }

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