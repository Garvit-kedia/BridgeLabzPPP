class Vehicle {
    private int maxSpeed;
    private String model;
    Vehicle(int maxSpeed,String model){ this.maxSpeed = maxSpeed; this.model = model; }
    void info(){ System.out.println(model + " Max:" + maxSpeed); }
}
