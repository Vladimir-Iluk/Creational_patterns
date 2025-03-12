package abstract_factory;

import java.awt.*;

public class MacButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You pressed the MacButton");
    }
}
