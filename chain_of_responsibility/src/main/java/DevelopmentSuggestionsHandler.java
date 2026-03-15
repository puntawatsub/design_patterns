public class DevelopmentSuggestionsHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTIONS) {
            System.out.printf("Message: %s, From: %s, Development Suggestion is saved and will be sent to relevant team.%n", message.getContent(), message.getSenderEmail());
        } else {
            System.out.println("Development Suggestion Department cannot handle this request, sending request to the next department.");
            if (getNextHandler() != null) {
                getNextHandler().handle(message);
            } else {
                System.out.println("End of the chain.");
            }
        }
    }
}
