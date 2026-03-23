public class Main {
    public static void main(String[] args) {
        Directory bigDirectory = new Directory();
        Directory smallDirectory = new Directory();

        bigDirectory.getElements().add(new File("file1.pdf", 12));
        smallDirectory.getElements().add(new File("music1.m4a", 10));
        smallDirectory.getElements().add(new File("file2.pdf", 30));
        bigDirectory.getElements().add(smallDirectory);
        bigDirectory.getElements().add(new File("file3.pdf", 5));
        bigDirectory.getElements().add(new File("music2.mp3", 112));

        FileSystemVisitor searchVisitor = new SearchVisitor(".pdf");
        FileSystemVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();

        bigDirectory.getElements().forEach(element -> element.accept(searchVisitor));
        System.out.println();
        bigDirectory.getElements().forEach(element -> element.accept(sizeCalculatorVisitor));

        System.out.println("Total size: " + ((SizeCalculatorVisitor) sizeCalculatorVisitor).getTotalSize() + "MB");
    }
}
