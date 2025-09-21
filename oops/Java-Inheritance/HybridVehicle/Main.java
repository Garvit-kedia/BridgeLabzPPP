public class Main {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle(160,"EV-1"); e.info(); e.charge();
        PetrolVehicle p = new PetrolVehicle(180,"PV-1"); p.info(); p.refuel();
    }
}
