package abstract_factory;

public class WinButton implements  IButton {
    @Override
    public void paint() {
        System.out.println("You pressed the Win Button");
    }
}
