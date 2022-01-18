package day38_inheritance1.browser;

public class Safari  extends Browser{
    /*
    4. Safari extends Browser
					methods:
						openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"
     */
    public Safari(String browser) {// Qa what will happen If we remove String browser
        super("Safari");
    }

    public  void  openBrowser(){
        System.out.println("opening safari browser");
    }

    public  void  closeBrowser(){
        System.out.println("closing safari browser");
    }
}
