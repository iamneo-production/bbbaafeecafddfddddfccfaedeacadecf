package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_pages {
	WebDriver Driver;
	
	@FindBy(xpath="//div[@class='_6ltg']//a[@role='button']")
	public static WebElement createAccount; 
	
	@FindBy(xpath="//div[@class='_5dbb']//input[@name='firstname']")
	public static WebElement firstname;
	
	@FindBy(xpath="//div[@class='_5dbb']//input[@name='lastname']")
	public static WebElement surname;
	
	@FindBy(xpath="//div[@class='_5dbb']//input[@name='reg_email__']")
	public static WebElement phonenumber;
	
	@FindBy(xpath="//*[@id=\"password_step_input\"]")
	public static WebElement newpassword;
	
	@FindBy(id="day")
	public static WebElement day;	
	
	@FindBy(id="month")
	public static WebElement month;
	
	@FindBy(id="year")
	public static WebElement year;
	
	@FindBy(xpath="//input[@type='radio'][@value='2']")
	public static WebElement gender;
	
	@FindBy(xpath="//div[@class='_1lch']//button[@type='submit']")
	public static WebElement signup;
	
	public Fb_pages(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
		
	}

	
}
