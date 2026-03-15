public class CompensationClaimHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            System.out.printf("Message: %s, From: %s, Compensation Decision: %s%n", message.getContent(), message.getSenderEmail(), String.valueOf(Math.random() < .5));
        } else {
            System.out.println("Compensation Claim Department cannot handle this request, sending request to the next department.");
            if (getNextHandler() != null) {
                getNextHandler().handle(message);
            } else {
                System.out.println("End of the chain.");
            }
        }
    }
}
