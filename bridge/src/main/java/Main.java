public class Main {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new SmartRadio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.channelUp();
        basicRemote.volumeDown();
        device.printStatus();

        System.out.println("Tests with smart remote.");
        SmartRemote advancedRemote = new SmartRemote(device);
        advancedRemote.googleAssistant("Hey Google, Power on!");
        advancedRemote.googleAssistant("Hey Google, next channel.");
        advancedRemote.googleAssistant("Hey Google, make it quieter.");
        device.printStatus();
    }
}
