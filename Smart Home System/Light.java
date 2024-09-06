public class Light extends SmartDevice {
    private int brightness; // 0 to 100

    public Light(String deviceName, int brightness) {
        super(deviceName);
        this.brightness = brightness;
    }

    @Override
    public void displayStatus() {
        String status = isOn() ? "On" : "Off";
        System.out.println("Light: " + getDeviceName() + ", Status: " + status + ", Brightness: " + brightness + "%");
    }
}
