package comtestingfreamwork.base;
import comtestingfreamwork.driver.DriverManagerTL;
import comtestingfreamwork.utils.Propertyreader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static comtestingfreamwork.driver.DriverManager.getDriver;
//import org.testng.annotations.BeforeMethod;

public class BasePage {
    //This page is comman to all
    public BasePage() {

    }
    public void openVWOUrl()throws Exception{
        getDriver().get(Propertyreader.readKey("url"));
    }
    public void implicitWait() {
        DriverManagerTL.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickElement(By by) {
        DriverManagerTL.getDriver().findElement(by).click();
    }

    public WebElement visibilityElement(final By elementLocation) {
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }
   /* public WebElement presencefElement(By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }*/
    public void eneterInput(By by, String key) {
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }

    public WebElement getElement(By key) {
        return DriverManagerTL.getDriver().findElement(key);
    }

    public void iWaitForElementToBeVisible(WebElement loc, String url) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfAllElements(loc));
            wait.until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            System.out.println("failed to wait" + e.toString());
        }
    }
}