
public class example {
    public static void main(String[] args) {
        cards azulbbva = new cards("azul", "bbva", 1, 300000);
        cards banamxPlat = new cards("platinum", "banamex", 2, 250000);
        
        System.out.println("bank: "+azulbbva.bank);
        System.out.println("limit: "+azulbbva.limit);

        System.out.println("card name: "+banamxPlat.name);
        System.out.println("limit: "+banamxPlat.limit);
        
    }
}
