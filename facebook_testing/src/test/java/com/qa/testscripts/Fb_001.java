package com.qa.testscripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.Fb_pages;

public class Fb_001 extends Testbase {
	
	@Test
	public void testcase_001() throws InterruptedException {
		String actual = Driver.getCurrentUrl();
		String expected = "https://www.facebook.com/";
		
		Assert.assertEquals(actual,expected);
		Fb_pages.createAccount.click();
		Thread.sleep(4000);
		Fb_pages.firstname.sendKeys("kiku");
		Fb_pages.surname.sendKeys("koku");
		Fb_pages.phonenumber.sendKeys("9087654578");
		Fb_pages.newpassword.sendKeys("abcdef@12345");
		Select selectday = new Select(Fb_pages.day);
		selectday.selectByVisibleText("22");
		Thread.sleep(3000);
		Select selectmonth = new Select(Fb_pages.month);
		selectmonth.selectByVisibleText("Nov");
		Thread.sleep(3000);
		Select selectyear = new Select(Fb_pages.year);
		selectyear.selectByVisibleText("2001");
		Thread.sleep(3000);
		Fb_pages.gender.click();
		Fb_pages.signup.click();
		Thread.sleep(8000);
		Assert.assertEquals(Driver.getTitle(), "Facebook");
	}
}