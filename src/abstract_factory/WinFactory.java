package abstract_factory;

public class WinFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }
}
