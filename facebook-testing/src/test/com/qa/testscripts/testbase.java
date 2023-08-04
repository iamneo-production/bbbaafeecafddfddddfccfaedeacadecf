package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.fbpages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase 
{
  WebDriver Driver;
  @Parameters({"Url"})
  @BeforeClass
  public void setup(String Url)throws IOException,InterruptedException
  {
	  
    WebDriverManager.chromedriver().setup();
	  Driver=new ChromeDriver();
	 
	  fbpages driver= new fbpages(Driver);
	  Driver.navigate().to(Url);
	  Thread.sleep(3000);
  }
	
//@AfterClass
//public void tearDown() 
//{
//	Driver.close();
//}
}
