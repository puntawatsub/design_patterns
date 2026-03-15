public class Message {
//    message type, message content, and sender email
    private MessageType messageType;
    private String content;
    private String senderEmail;

    public Message(MessageType messageType, String content, String senderEmail) {
        this.messageType = messageType;
        this.content = content;
        this.senderEmail = senderEmail;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }
}
