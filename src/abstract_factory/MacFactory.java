package abstract_factory;

public class MacFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }
}
