public class SecurityCamera extends SmartDevice {
    private String cameraLocation;

    public SecurityCamera(String deviceName, String cameraLocation) {
        super(deviceName);
        this.cameraLocation = cameraLocation;
    }

    @Override
    public void displayStatus() {
        String status = isOn() ? "On" : "Off";
        System.out.println("Security Camera: " + getDeviceName() + ", Status: " + status + ", Location: " + cameraLocation);
    }
}
