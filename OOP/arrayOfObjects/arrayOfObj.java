//


public class arrayOfObj {
    public static void main(String[] args) {
        Car mcqueen = new Car("mustang", "ford", 123);
        Car sally = new Car("carrera", "porsche", 988);
        Car doc = new Car("model76", "ford",445);

        Car[] cars = {mcqueen, sally, doc};

        Car[] cars2 = {new Car("sentra","nissan",941),
                        new Car("yaris", "toyota", 192)};

        for (Car car : cars){
            car.speeding();
        }

        for (Car car:cars2){
            car.speeding();
        }

    }
    
}

