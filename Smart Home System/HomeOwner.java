public class HomeOwner extends User {

    public HomeOwner(String username) {
        super(username);
    }

    @Override
    public void controlDevice(SmartDevice device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
        System.out.println(getUsername() + " has turned " + (turnOn ? "on" : "off") + " the " + device.getDeviceName());
    }
}
