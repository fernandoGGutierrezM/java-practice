
public class searchingArr {
    public static void main(String[] args) {
        
        int[] numbers = {1,9,2,4,5,1,6,7,2};
        int target = 12;
        boolean notfound = true;

        //rubbish linear search xd
        for(int i=0;i<numbers.length;i++){
            if (target==numbers[i]){
                System.out.println("ELEMENT FOUND AT: "+i);
                notfound=false;
                break;

            }
        } 

        if (notfound){
            System.out.println("NOT FOUND NIGGA");
        }

    }
}
