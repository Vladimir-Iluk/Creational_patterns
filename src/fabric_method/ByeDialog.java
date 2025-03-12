package fabric_method;

public class ByeDialog extends Dialog {
    @Override
    protected Print createPrint() {
        return new PrintBye();
    }
}
