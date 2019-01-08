package com.cucumber.DemoCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepsImplemention 
{
	private WebDriver driver=null;
	
	@Given("^I navigate to application \"([^\"]*)\"$")
	public void i_navigate_to_application(String arg1) throws Throwable 
	{
		System.out.println("IN Demo Cucumber method");
		System.setProperty("webdriver.chrome.driver","G:\\Software\\Selenium\\Updated\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(arg1);
		//driver.manage().timeouts().pageLoadTimeout(150,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_and_password(String arg1, String arg112) throws Throwable 
	{
		System.out.println("In Cucumber Method");
	     driver.findElement(By.id("login-email-field")).sendKeys(arg1);
	     driver.findElement(By.id("login-password-field_")).sendKeys(arg112);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable 
	{
		driver.findElement(By.id("log-in-button")).click();
		Assert.assertEquals(driver.getTitle(),"CodePen Login");
	}

	@Then("^I should able to login$")
	public void i_should_able_to_login() throws Throwable 
	{
		String title=driver.getTitle();
		Assert.assertEquals(title,"CodePen Login");
	}
	
	@Then("^I should not able to login$")
	public void i_should_not_able_to_login() throws Throwable
	{
		boolean actual=driver.findElement(By.linkText("Sign Up")).isDisplayed();
		boolean expected=true;
		Assert.assertEquals(actual,expected);
    }
}
