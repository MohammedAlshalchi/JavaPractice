package day38_inheritance1.browser;

public class Opera extends  Browser{
    /*
    3. Opera extends Browser
					methods:
						openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"
     */

    public Opera(String browser) {
        super("Opera");
    }

    public  void  openBrowser(){
        System.out.println("opening opera browser");
    }

    public  void  closeBrowser(){
        System.out.println("closing opera browser");
    }






}
