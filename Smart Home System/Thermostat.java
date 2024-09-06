public class Thermostat extends SmartDevice {
    private int temperature; // in Celsius

    public Thermostat(String deviceName, int temperature) {
        super(deviceName);
        this.temperature = temperature;
    }

    @Override
    public void displayStatus() {
        String status = isOn() ? "On" : "Off";
        System.out.println("Thermostat: " + getDeviceName() + ", Status: " + status + ", Temperature: " + temperature + "°C");
    }
}

