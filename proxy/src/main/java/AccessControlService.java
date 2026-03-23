import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccessControlService {

    private final HashMap<User, List<Document>> documentOwners;

    private static AccessControlService instance = null;

    private AccessControlService() {
        documentOwners = new HashMap<>();
    }

    public void addDocument(User user, Document document) {
        if (documentOwners.containsKey(user)) {
            documentOwners.get(user).add(document);
        } else {
            List<Document> documents = new ArrayList<>();
            documents.add(document);
            documentOwners.put(user, documents);
        }
    }

    public boolean isAllowed(User user, Document document) {
        return documentOwners.containsKey(user) && documentOwners.get(user).contains(document);
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }
}
