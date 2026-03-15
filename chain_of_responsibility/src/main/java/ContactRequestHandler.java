public class ContactRequestHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.printf("Message: %s, From: %s, Contact Request is saved, you'll be emailed back soon.%n", message.getContent(), message.getSenderEmail());
        } else {
            System.out.println("Contact Request Department cannot handle this request, sending request to the next department.");
            if (getNextHandler() != null) {
                getNextHandler().handle(message);
            } else {
                System.out.println("End of the chain.");
            }
        }
    }
}
