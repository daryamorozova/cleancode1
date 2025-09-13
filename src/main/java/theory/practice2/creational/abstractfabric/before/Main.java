package theory.practice2.creational.abstractfabric.before;

public class Main {
    public static void main(String[] args) {
        Button button;
        Checkbox checkbox;
        String osType = "Windows";

        if ("Windows".equals(osType)) {
            button = new WindowsButton(); // фабричный метод
            checkbox = new WindowsCheckbox(); // фабричный метод
        } else {
            button = new MacOSButton(); // фабричный метод
            checkbox = new MacOSCheckbox(); // фабричный метод
        }

        button.paint();
        checkbox.paint();
    }
}
