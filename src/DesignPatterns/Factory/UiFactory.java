package DesignPatterns.Factory;

// Holds all the Factory methods
public interface UiFactory {

    public Button createButton();
    public Dropdown createDropdown();
}
