package com.inetbanking.testCases;

import com.inetbanking.pageObjects.LoginPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

public class TC_Login_001 extends BaseClass {
    @Test
    public void loginTest() throws IOException
    {

        logger.info("URL is opened");

        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        logger.info("Entered username");

        lp.setPassword(password);
        logger.info("Entered password");

        lp.clickSubmit();

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
        {
            Assert.assertTrue(true);
            logger.info("Login test passed");
        }
        else
        {
            captureScreen(driver,"loginTest");
            Assert.assertTrue(false);
            logger.info("Login test failed");
        }

    }
}
