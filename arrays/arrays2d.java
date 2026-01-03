public class arrays2d {
    public static void main(String[] args) {
        
        String[] carnita = {"aguja","bistek","palomilla"};
        String[] snacks = {"papitas", "platanos"};

        String[][] groceries = {carnita, snacks};
        
//        String[][] groceeries = {{"aguja","bistek","palomilla"},
//                                {"papitas", "platanos"}};

        //telephone array
        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};
        
        for(String[] foods:groceries){
            for(String food:foods){
                System.out.println(food+" ");
            }
            System.out.println();
        }
    }
}
