import java.util.HashMap;

public class Library extends DocumentFactory {
    private final HashMap<Integer, Document> documents;

    public Library() {
        this.documents = new HashMap<>();
    }

    public Document getDocument(int id) {
        return documents.get(id);
    }

    public HashMap<Integer, Document> getDocuments() {
        return documents;
    }

    @Override
    public Document createDocument(User user, int id, String content, boolean isProtected) {
        Document document;
        if (isProtected) {
            document = new ProxyDocument(id, content);
        } else {
            document = new RealDocument(id, content);
        }
        documents.put(id, document);
        AccessControlService.getInstance().addDocument(user, document);
        return document;
    }
}
