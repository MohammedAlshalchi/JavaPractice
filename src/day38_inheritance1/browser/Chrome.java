package day38_inheritance1.browser;

public class Chrome extends Browser{
    /*
  ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"
     */

    public Chrome(String browser) {
        super("Chrome");
    }

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }

}
