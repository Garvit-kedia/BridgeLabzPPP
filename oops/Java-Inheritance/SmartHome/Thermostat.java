class Thermostat extends Device {
    private double temperatureSetting;
    Thermostat(String id, boolean status, double temp) {
        super(id,status); this.temperatureSetting = temp;
    }
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temp: " + temperatureSetting);
    }
}
