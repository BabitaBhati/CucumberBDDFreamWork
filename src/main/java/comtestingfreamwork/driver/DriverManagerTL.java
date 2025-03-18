package comtestingfreamwork.driver;

import comtestingfreamwork.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public class DriverManagerTL{
    //ThreadLocal used to create the Driver

    public static final ThreadLocal<WebDriver> dr=new ThreadLocal<>();

    public DriverManagerTL() {
    }


    public static void setDriver(WebDriver driverref){
        dr.set(driverref);
    }
    public static WebDriver getDriver(){
       return dr.get();
    }
    public static void unload(){
        dr.remove();
    }
    /*public static void down(){
        if (Objects.nonNull(DriverManagerTL.getDriver())){
            getDriver().quit();
            unload();
        }
    }*/

    public static void init()throws Exception {
        if (Objects.isNull(DriverManagerTL.getDriver())) {
            //use to handle the behave of the google chrome
            ChromeOptions chromeOptions=new ChromeOptions();
            chromeOptions.addArguments("---guest---");
            WebDriver driver = new ChromeDriver(chromeOptions);
            setDriver(driver);
        }
    }
}
