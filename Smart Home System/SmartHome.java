import java.util.ArrayList;

public class SmartHome {
    private ArrayList<SmartDevice> devices = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void controlDevice(String username, String deviceName, boolean turnOn) {
        User user = users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);
        SmartDevice device = devices.stream().filter(d -> d.getDeviceName().equals(deviceName)).findFirst().orElse(null);

        if (user != null && device != null) {
            user.controlDevice(device, turnOn);
        } else {
            System.out.println("User or Device not found.");
        }
    }

    public void displayDevicesStatus() {
        for (SmartDevice device : devices) {
            device.displayStatus();
        }
    }

    public static void main(String[] args) {
        SmartHome home = new SmartHome();

        // Adding devices
        home.addDevice(new Light("Living Room Light", 75));
        home.addDevice(new Thermostat("Main Thermostat", 22));
        home.addDevice(new SecurityCamera("Front Door Camera", "Front Door"));

        // Adding users
        home.addUser(new HomeOwner("alice"));
        home.addUser(new Admin("admin"));

        // Control devices
        home.controlDevice("alice", "Living Room Light", true);
        home.controlDevice("admin", "Main Thermostat", false);

        // Display device status
        System.out.println("\nCurrent Device Status:");
        home.displayDevicesStatus();
    }
}

