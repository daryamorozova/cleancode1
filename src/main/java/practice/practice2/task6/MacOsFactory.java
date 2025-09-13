package practice.practice2.task6;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}
