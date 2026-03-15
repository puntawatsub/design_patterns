public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.printf("Message: %s, From: %s, General Feedback is saved and will be sent to relevant team.%n", message.getContent(), message.getSenderEmail());
        } else {
            System.out.println("General Feedback Department cannot handle this request, sending request to the next department.");
            if (getNextHandler() != null) {
                getNextHandler().handle(message);
            } else {
                System.out.println("End of the chain.");
            }
        }
    }
}
