package com.qa.testscripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.fbpages;

public class fbscript extends testbase {
	
	@Test
	public void testCreateAcc() throws InterruptedException {
		String actual = Driver.getCurrentUrl();
		String expected = "https://www.facebook.com/";
		
		Assert.assertEquals(actual,expected);
		fbpages.createAccount.click();
		Thread.sleep(4000);
		fbpages.firstname.sendKeys("kiku");
		fbpages.surname.sendKeys("koku");
		fbpages.phonenumber.sendKeys("9087654578");
		fbpages.newpassword.sendKeys("abcdef@12345");
		Select selectday = new Select(fbpages.day);
		selectday.selectByVisibleText("22");
		Thread.sleep(3000);
		Select selectmonth = new Select(fbpages.month);
		selectmonth.selectByVisibleText("Nov");
		Thread.sleep(3000);
		Select selectyear = new Select(fbpages.year);
		selectyear.selectByVisibleText("2001");
		Thread.sleep(3000);
		fbpages.gender.click();
		fbpages.signup.click();
		Thread.sleep(8000);
		Assert.assertEquals(Driver.getTitle(), "Facebook");
	}
}