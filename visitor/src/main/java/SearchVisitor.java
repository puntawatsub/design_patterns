import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {

    private List<File> elements;

    private String criterion;

    public SearchVisitor(String criterion) {
        this.criterion = criterion;
        elements = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(criterion)) {
            elements.add(file);
            System.out.print(" " + file.getName() + " ");
        }
    }

    @Override
    public void visit(Directory directory) {
        System.out.print("[");
        for (int i = 0; i < directory.getElements().size(); i++) {
            FileSystemElement element = directory.getElements().get(i);
            if (element instanceof Directory) {
                visit((Directory) element);
            } else {
                visit((File) element);
            }
        }
        System.out.print("]");
    }
}
