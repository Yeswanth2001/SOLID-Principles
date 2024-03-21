// High-level module
interface Switchable {
    void turnOn();
    void turnOff();
}

// Low-level module
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: turned off");
    }
}

// Low-level module
class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: turned off");
    }
}

// High-level module
class ElectricPowerSwitch {
    Switchable device;
    boolean on;

    public ElectricPowerSwitch(Switchable device) {
        this.device = device;
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void press() {
        boolean isOn = isOn();
        if (isOn) {
            device.turnOff();
            on = false;
        } else {
            device.turnOn();
            on = true;
        }
    }
}

class DIP {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        ElectricPowerSwitch electricPowerSwitch = new ElectricPowerSwitch(lightBulb);

        electricPowerSwitch.press();
        electricPowerSwitch.press();

        Switchable fan = new Fan();
        electricPowerSwitch = new ElectricPowerSwitch(fan);

        electricPowerSwitch.press();
        electricPowerSwitch.press();
    }
}
