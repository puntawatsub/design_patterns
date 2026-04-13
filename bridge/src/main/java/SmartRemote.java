public class SmartRemote extends BasicRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void googleAssistant(String command) {
        System.out.println("Google Assistant processing: \"" + command + "\"");

        String input = command.toLowerCase();

        if (input.contains("power") || input.contains("turn")) {
            power();
        } else if (input.contains("volume up") || input.contains("louder") || input.contains("increase")) {
            volumeUp();
        } else if (input.contains("volume down") || input.contains("quieter") || input.contains("decrease")) {
            volumeDown();
        } else if (input.contains("next") || input.contains("channel up")) {
            channelUp();
        } else if (input.contains("previous") || input.contains("back") || input.contains("channel down")) {
            channelDown();
        } else {
            System.out.println("Sorry, I didn't recognize that command.");
        }
    }
}
