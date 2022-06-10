package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerpage {

    WebDriver ldriver;
    public AddCustomerpage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
    @CacheLookup
    WebElement lnkAddNewCustomer;

    @FindBy(name="name")
    @CacheLookup
    WebElement txtCustomerName;

    @FindBy(xpath="//input[@value='m']")
    @CacheLookup
    WebElement rdGender;

    @FindBy(xpath="//input[@id='dob']")
    @CacheLookup
    WebElement txtdob;

    @FindBy(xpath="//textarea[@name='addr']")
    @CacheLookup
    WebElement txtaddress;

    @FindBy(xpath="//input[@name='city']")
    @CacheLookup
    WebElement txtcity;

    @FindBy(xpath="//input[@name='state']")
    @CacheLookup
    WebElement txtstate;

    @FindBy(xpath="//input[@name='pinno']")
    @CacheLookup
    WebElement txtpinno;

    @FindBy(xpath="//input[@name='telephoneno']")
    @CacheLookup
    WebElement txttelephoneno;

    @FindBy(xpath="//input[@name='emailid']")
    @CacheLookup
    WebElement txtemailid;

    @FindBy(xpath="//input[@name='password']")
    @CacheLookup
    WebElement txtpassword;

    @FindBy(xpath = "//input[@name='sub']")
    @CacheLookup
    WebElement btnSubmit;


    public void clickAddNewCustomer(){

        lnkAddNewCustomer.click();
    }

    public void custName(String cname){
        txtCustomerName.sendKeys(cname);
    }

    public void custgender(String cgender) {
        rdGender.click();
    }

    public void custdob(String mm,String dd,String yy) {
        txtdob.sendKeys(mm);
        txtdob.sendKeys(dd);
        txtdob.sendKeys(yy);

    }

    public void custaddress(String caddress) {
        txtaddress.sendKeys(caddress);
    }

    public void custcity(String ccity) {
        txtcity.sendKeys(ccity);
    }

    public void custstate(String cstate) {
        txtstate.sendKeys(cstate);
    }

    public void custpinno(String cpinno) {
        txtpinno.sendKeys(String.valueOf(cpinno));
    }

    public void custtelephoneno(String ctelephoneno) {
        txttelephoneno.sendKeys(ctelephoneno);
    }

    public void custemailid(String cemailid) {
        txtemailid.sendKeys(cemailid);
    }

    public void custpassword(String cpassword) {
        txtpassword.sendKeys(cpassword);
    }

    public void custsubmit() {
        btnSubmit.click();
    }






}
