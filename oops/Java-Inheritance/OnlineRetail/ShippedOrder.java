class ShippedOrder extends Order {
    private String trackingNumber;
    ShippedOrder(String id, String date, String tracking) {
        super(id,date); this.trackingNumber = tracking;
    }
    @Override
    String getOrderStatus() { return "Shipped (Tracking:" + trackingNumber + ")"; }
}
