import java.util.Base64;

public class EncryptedPrinter extends Printer {

    private final Printer printer;

    public EncryptedPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        String encrypted = Base64.getEncoder().encodeToString(text.getBytes());
        printer.print(encrypted);
    }
}
