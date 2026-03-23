public class ProxyDocument extends Document {

    private Document document;

    public ProxyDocument(int id, String content) {
        document = new RealDocument(id, content);
    }

    @Override
    public int getId() {
        return document.getId();
    }

    @Override
    public String getCreationDate() {
        return document.getCreationDate();
    }

    @Override
    public String getContent() {
        return "Access Denied";
    }

    @Override
    public String getContent(User user) {
        if (AccessControlService.getInstance().isAllowed(user, this)) {
            return document.getContent();
        }
        return "Access Denied";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProxyDocument that = (ProxyDocument) o;
        return that.getId() == getId();
    }


}
