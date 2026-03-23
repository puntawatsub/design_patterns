import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private final List<FileSystemElement> elements;

    public Directory() {
        elements = new ArrayList<>();
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
