package day44Abstract2.browserTask;

public class DriverObjects {
    /*
    7. Create a class named DriverObjects:
				Create objects of each driver
Test all the methods of each driver
     */

    public static void main(String[] args) throws InterruptedException{
//        SafariDriver safariDriver = new SafariDriver();
//
//        OperaDriver operaDriver =new OperaDriver();
//        operaDriver.getTitle();
//
//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.close();
//       //System.out.println(chromeDriver.findElement("abc"));
//
//        EdgeDriver edgeDriver =new EdgeDriver();
//        edgeDriver.quit();


OperaDriver driver1   =new OperaDriver();
ChromeDriver driver2  = new ChromeDriver();
SafariDriver driver3  = new SafariDriver();
FireFoxDriver driver4 = new FireFoxDriver();
EdgeDriver driver5    = new EdgeDriver();

        System.out.println("driver5 = " + driver5);
        System.out.println("driver4 = " + driver4);
        System.out.println("driver3 = " + driver3);
        System.out.println("driver2 = " + driver2);
        System.out.println("driver1 = " + driver1);


driver2.get("https://www.google.com/");
        Thread.sleep(2000);
       // driver2.get();
        Thread.sleep(2000);
driver2.executeScript("testCase");
driver2.findElement("id");
driver2.takeScreenShot();

        driver2.close();

    }




}
