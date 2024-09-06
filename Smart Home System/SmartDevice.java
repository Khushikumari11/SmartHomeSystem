public abstract class SmartDevice {
    private String deviceName;
    private boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public abstract void displayStatus();
}
