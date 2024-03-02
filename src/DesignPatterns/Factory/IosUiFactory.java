package DesignPatterns.Factory;

public class IosUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
