package comtestingfreamwork.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    static WebDriver driver;

    public static void start() {
        if (driver == null) {
            driver = new ChromeDriver();
            System.out.println("chrome driver");
        }
    }
  public static WebDriver getDriver(){
        return driver;
   }

   public static void down(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
