package DesignPatterns.Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        UiFactory ui = flutter.createUiFactory("Android");
        Button b = ui.createButton();
        Dropdown d= ui.createDropdown();
        b.changeSize(8);
        b.setText();
    }
}
