public class XMLPrinter extends Printer {

    private final Printer printer;

    public XMLPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(String.format("<message>%s</message>", text));
    }
}
