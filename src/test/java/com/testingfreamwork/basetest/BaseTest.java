package com.testingfreamwork.basetest;

import comtestingfreamwork.base.BasePage;
import comtestingfreamwork.driver.DriverManager;
import comtestingfreamwork.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage {
    @BeforeMethod
    public void setup()throws Exception{
        DriverManagerTL.init();
    }
   /* @AfterMethod
    public void teardown(){
        DriverManagerTL.down();
    }*/
}
