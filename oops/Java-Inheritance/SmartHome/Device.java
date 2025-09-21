class Device {
    private String deviceId;
    private boolean status;
    Device(String deviceId, boolean status) { this.deviceId = deviceId; this.status = status; }
    void displayStatus() { System.out.println(deviceId + " | On:" + status); }
}
