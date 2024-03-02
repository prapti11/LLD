package DesignPatterns.Factory;

public class Flutter {

    public void setTheme(String themeName){
        System.out.printf("Set theme as %s", themeName);
    }

    public void setRefreshRate(int freq){
        System.out.printf("Set refresh rate as %s", freq);
    }

    // Factory method -> Practical/ plain factory
    public UiFactory createUiFactory(String platform){
        if(platform.equals("Android")) return new AndroidUiFactory();
        else if(platform.equals("IOS")) return new IosUiFactory();
        return null;

    }
}

