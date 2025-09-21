public class Main {
    public static void main(String[] args) {
        Vehicle[] v = {
            new Car(180,"Petrol",5),
            new Truck(120,"Diesel",12.5),
            new Motorcycle(140,"Petrol",false)
        };
        for(Vehicle s: v) s.displayInfo();
    }
}
