package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.Fb_pages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase 
{
  WebDriver Driver;
  //@Parameters({"Url"})
  @BeforeClass
  public void setup()throws IOException,InterruptedException
  {
	  
    WebDriverManager.chromedriver().setup();
	  Driver=new ChromeDriver();
	 
	  Fb_pages driver=new Fb_pages(Driver);
	  Driver.navigate().to(Url);
	  Thread.sleep(5000);
  }
	
//@AfterClass
//public void tearDown() 
//{
//	Driver.close();
//}
}
