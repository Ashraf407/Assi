package com.rbs1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	public static WebDriver driver;
	
	@Given("User is on Home Page2")
	public void user_is_on_Home_Page2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}

	@When("User Navigate to LogIn Page2")
	public void user_Navigate_to_LogIn_Page2() throws InterruptedException {
		driver.get("http://spicejet.com/");
		 Reporter.addStepLog("My test addStepLog message");
	        Reporter.addScenarioLog("This is scenario log");
		driver.manage().window().maximize();
	
		Thread.sleep(1000);
		
	}
	@Given("User is on Home Page2")
	public void user_is_on_Home_Page1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

	}

	@When("User Navigate to LogIn Page2")
	public void user_Navigate_to_LogIn_Page1() throws InterruptedException {
		driver.get("http://spicejet.com/");
		Reporter.addStepLog("My test addStepLog message");
		Reporter.addScenarioLog("This is scenario log");
		driver.manage().window().maximize();

		Thread.sleep(1000);

	}

	@When("User enters UserName and Password2")
	public void user_enters_UserName_and_Password2() throws InterruptedException  {
		Thread.sleep(1000);
		 Reporter.addStepLog("My test addStepLog message");
	        Reporter.addScenarioLog("This is scenario log");
		
		
		
	}

	@Then("Message displayed Login Successfully2")
	public void message_displayed_Login_Successfully2() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.id("header-addons"));
		a.moveToElement(e).build().perform();
		Thread.sleep(3000);
	
		
		
		
	}



}
