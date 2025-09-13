package theory.practice2.creational.abstractfabric.after;

// абстрактная фабрика
public interface GUIFactory {
    Button createButton(); // фабричный метод
    Checkbox createCheckbox(); // фабричный метод
}
