package day38_inheritance1.browser;

public class FireFox extends Browser{
    /*
    2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"
     */

    public FireFox(String browser) {
        super("FireFox");
    }

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing fire fox browser");
    }
}
