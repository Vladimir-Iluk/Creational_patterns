package fabric_method;

public abstract class Dialog {
    protected abstract Print createPrint();

    public void render() {
        Print printer = createPrint();
        printer.print();
    }
}