public class SizeCalculatorVisitor implements FileSystemVisitor {

    private long totalSize;

    public SizeCalculatorVisitor() {
        totalSize = 0;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
        System.out.printf("Visited file %s: %dmb %n", file.getName(), file.getSize());
    }

    @Override
    public void visit(Directory directory) {
        directory.getElements().forEach(element -> {
            if (element instanceof Directory) {
                visit((Directory) element);
                System.out.println("Going into a directory");
            } else {
                visit((File) element);
            }
        });
    }

    public long getTotalSize() {
        return totalSize;
    }
}
