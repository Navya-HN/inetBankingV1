package com.inetbanking.testCases;

import com.inetbanking.pageObjects.AddCustomerpage;
import com.inetbanking.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TC_AddCustomerTest_003 extends BaseClass{

    @Test
    public void addNewCustomer() throws InterruptedException, IOException {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        logger.info("User name is provided");
        lp.setPassword(password);
        logger.info("Passsword is provided");
        lp.clickSubmit();

        Thread.sleep(3000);

        AddCustomerpage addcust=new AddCustomerpage(driver);

        addcust.clickAddNewCustomer();
        driver.navigate().refresh();
        Thread.sleep(2000);
        addcust.clickAddNewCustomer();
        //Thread.sleep(2000);
        //driver.switchTo().frame("ad_iframe");
        //driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
        //By ad_accept = By.xpath("");
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(ad_accept)).click();

        logger.info("providing customer details....");
        addcust.custName("nayan");
        addcust.custgender("male");
        addcust.custdob("10","15","1985");
        Thread.sleep(5000);
        addcust.custaddress("INDIA");
        addcust.custcity("HYD");
        addcust.custstate("AP");
        addcust.custpinno("5000074");
        addcust.custtelephoneno("987890091");

        String email=randomestring()+"@gmail.com";
        addcust.custemailid(email);
        addcust.custpassword("abcdef");
        addcust.custsubmit();

        Thread.sleep(3000);

        logger.info("validation started....");

        boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"addNewCustomer");
            Assert.assertTrue(false);
        }
    }
}
