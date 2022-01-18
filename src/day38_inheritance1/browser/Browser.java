package day38_inheritance1.browser;

public class Browser {
    /*
    1. Create a class named Browser:
			Methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser():  prints "closing chrome browser"
     */

    public String browser;

    public Browser(String browser) {
        this.browser = browser;
    }

public void openBrowser() {
    System.out.println("opening chrome browser");
}

public void closeBrowser() {
    System.out.println("closing chrome browser");
}


    public String toString() {
        return "Browser{" +
                "browser='" + browser + '\'' +
                '}';
    }




}
