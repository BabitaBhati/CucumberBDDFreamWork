package comtestingfreamwork.pages;

import comtestingfreamwork.base.BasePage;
import comtestingfreamwork.driver.DriverManagerTL;
import comtestingfreamwork.utils.Propertyreader;
import org.openqa.selenium.By;





public class LoginPage extends BasePage {

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By submitbutton = By.id("js-login-btn");
    private By errormessage = By.id("js-notification-box-msg");

    public LoginPage LoginVWoPositive() throws Exception {
        //openURL("url");
        eneterInput(username, Propertyreader.readKey("username"));
        eneterInput(password, Propertyreader.readKey("password"));
        clickElement(submitbutton);
        return this;
    }

    //step2  login with invalid crads
    public LoginPage LoginVWoNeg() throws Exception {
        //openURL("url");
        eneterInput(username, Propertyreader.readKey("invalid_username1"));
        eneterInput(password, Propertyreader.readKey("invalid_password1"));
        clickElement(submitbutton);
        visibilityElement(errormessage).getText();
        return this;
    }


    public void openURL(String url) {
        DriverManagerTL.getDriver().get(url);
    }
}
