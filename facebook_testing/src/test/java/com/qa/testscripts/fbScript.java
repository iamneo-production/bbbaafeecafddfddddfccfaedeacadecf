package com.qa.testscripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.fbpages;

public class fbScript extends Testbase {
	
	@Test
	public void testcase_001() throws InterruptedException {
		String actual = Driver.getCurrentUrl();
		String expected = "https://www.facebook.com/";
		
		Assert.assertEquals(actual,expected);
		fbpages.createAccount.click();
		Thread.sleep(3000);
		fbpages.firstname.sendKeys("abc");
		fbpages.surname.sendKeys("m");
		fbpages.phonenumber.sendKeys("9876543210");
		fbpages.newpassword.sendKeys("abc^54321");
		Select selectday = new Select(fbpages.day);
		selectday.selectByVisibleText("02");
		Thread.sleep(3000);
		Select selectmonth = new Select(fbpages.month);
		selectmonth.selectByVisibleText("Dec");
		Thread.sleep(3000);
		Select selectyear = new Select(fbpages.year);
		selectyear.selectByVisibleText("2000");
		Thread.sleep(3000);
		fbpages.gender.click();
		fbpages.signup.click();
		Thread.sleep(5000);
		Assert.assertEquals(Driver.getTitle(), "Facebook");
	}
}