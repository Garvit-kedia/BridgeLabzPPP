public class Main {
    public static void main(String[] args) {
        Worker[] ws = { new Chef("A",1), new Waiter("B",2) };
        for(Worker w: ws) w.performDuties();
    }
}
