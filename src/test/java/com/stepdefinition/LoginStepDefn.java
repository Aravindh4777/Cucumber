package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefn  {

	WebDriver driver;
	@Given("I am on Adactin Page")
	public void i_am_on_Adactin_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("I must Enter Username and Password")
	public void i_must_Enter_Username_and_Password() {
driver.findElement(By.cssSelector("#username")).sendKeys("aravindh26");
driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty$26");
	}

	@When("I should click on Login")
	public void i_should_click_on_Login() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@Then("I want to verify Success Message")
	public void i_want_to_verify_Success_Message() {
		driver.quit();
	}


}
