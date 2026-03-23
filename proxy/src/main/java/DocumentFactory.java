public abstract class DocumentFactory {
    public abstract Document createDocument(User user, int id, String content, boolean isProtected);
}
