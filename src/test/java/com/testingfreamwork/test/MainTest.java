package com.testingfreamwork.test;

import com.testingfreamwork.basetest.BaseTest;
import comtestingfreamwork.pages.LoginPage;
import comtestingfreamwork.utils.Propertyreader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest extends BaseTest {
    //LoginPage page;
    @Test
    @Description("Verify the login cred...")
    public void LoginVWoNegative()throws Exception {
        LoginPage page = new LoginPage();
        page.openURL(Propertyreader.readKey("url"));
        page.LoginVWoNeg();

    }

    @Test
    @Description("Verify the login cred...")
    public void LoginVWoPositive()throws Exception {
       LoginPage page = new LoginPage();
       page.openURL(Propertyreader.readKey("url"));
       page.LoginVWoPositive();

    }
}
