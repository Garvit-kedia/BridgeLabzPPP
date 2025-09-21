class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    DeliveredOrder(String id, String date, String tracking, String deliveryDate) {
        super(id,date,tracking); this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() { return "Delivered on " + deliveryDate; }
}
