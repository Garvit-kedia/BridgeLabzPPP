class Order {
    private String orderId;
    private String orderDate;
    Order(String orderId, String orderDate) { this.orderId = orderId; this.orderDate = orderDate; }
    String getOrderStatus() { return "Created"; }
}
