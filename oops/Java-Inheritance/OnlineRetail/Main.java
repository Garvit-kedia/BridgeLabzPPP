public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("O100","2025-09-01");
        Order o2 = new ShippedOrder("O101","2025-09-03","TRK123");
        Order o3 = new DeliveredOrder("O102","2025-08-25","TRK999","2025-08-28");
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
