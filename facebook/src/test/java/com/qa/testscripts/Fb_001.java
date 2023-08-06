package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_001 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    public class Fb_pages {
        WebDriver Driver;

        @FindBy(xpath="//div[@class='_6ltg']//a[@role='button']")
        public WebElement createAccount; 

        @FindBy(xpath="//div[@class='_5dbb']//input[@name='firstname']")
        public WebElement firstname;

        @FindBy(xpath="//div[@class='_5dbb']//input[@name='lastname']")
        public WebElement surname;

        @FindBy(xpath="//div[@class='_5dbb']//input[@name='reg_email__']")
        public WebElement phonenumber;

        @FindBy(xpath="//*[@id=\"password_step_input\"]")
        public WebElement newpassword;

        @FindBy(id="day")
        public WebElement day;    

        @FindBy(id="month")
        public WebElement month;

        @FindBy(id="year")
        public WebElement year;

        @FindBy(xpath="//input[@type='radio'][@value='2']")
        public WebElement gender;

        @FindBy(xpath="//div[@class='_1lch']//button[@type='submit']")
        public WebElement signup;

        public Fb_pages(WebDriver Driver) {
            this.Driver = Driver;
            PageFactory.initElements(Driver, this);
        }
    }

    @Test
    public void testcase_001() throws InterruptedException {
        String actual = driver.getCurrentUrl();
        String expected = "https://www.facebook.com/";

        Assert.assertEquals(actual, expected);
        Fb_pages fbPages = new Fb_pages(driver);
        fbPages.createAccount.click();
        Thread.sleep(4000);
        fbPages.firstname.sendKeys("kiku");
        fbPages.surname.sendKeys("koku");
        fbPages.phonenumber.sendKeys("9087654578");
        fbPages.newpassword.sendKeys("abcdef@12345");
        Select selectday = new Select(fbPages.day);
        selectday.selectByVisibleText("22");
        Thread.sleep(3000);
        Select selectmonth = new Select(fbPages.month);
        selectmonth.selectByVisibleText("Nov");
        Thread.sleep(3000);
        Select selectyear = new Select(fbPages.year);
        selectyear.selectByVisibleText("2001");
        Thread.sleep(3000);
        fbPages.gender.click();
        fbPages.signup.click();
        Thread.sleep(8000);
        Assert.assertEquals(driver.getTitle(), "Facebook");
    }

    /*@AfterClass
    public void tearDown() {
        driver.quit();
    }*/
}
