class Car extends Vehicle {
    private int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed,fuelType); this.seatCapacity = seatCapacity;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}
