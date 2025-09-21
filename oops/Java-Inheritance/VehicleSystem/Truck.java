class Truck extends Vehicle {
    private double loadCapacity;
    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed,fuelType); this.loadCapacity = loadCapacity;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("LoadCapacity: " + loadCapacity + " tons");
    }
}
