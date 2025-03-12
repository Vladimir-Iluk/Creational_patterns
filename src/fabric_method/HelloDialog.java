package fabric_method;

public class HelloDialog extends Dialog {
    @Override
    protected Print createPrint() {
        return new PrintHello();
    }
}
