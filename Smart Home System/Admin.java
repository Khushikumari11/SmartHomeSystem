public class Admin extends User {

    public Admin(String username) {
        super(username);
    }

    @Override
    public void controlDevice(SmartDevice device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
        System.out.println(getUsername() + " has administratively turned " + (turnOn ? "on" : "off") + " the " + device.getDeviceName());
    }
}

