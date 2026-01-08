public class Car{
    String model;
    String make;
    int plateNum;

    Car(String model, String make, int plateNum){
        this.model=model;
        this.make=make;
        this.plateNum=plateNum;
    }

    void speeding(){
        System.out.println(model+" is speeding, plate: "+plateNum);
    }

}