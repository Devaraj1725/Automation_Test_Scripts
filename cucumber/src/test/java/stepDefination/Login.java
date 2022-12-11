package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public WebDriver driver;
	@Given("open the browser and enter the test url.")
	public void open_the_browser_and_enter_the_test_url()
	{
	   WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://facebook.com");
	}

	@Then("login page should be displayed.")
	public void login_page_should_be_displayed()
	{
	   
	}

	@When("user enter valid credintails")
	public void user_enter_valid_credintails() {
		driver.findElement(By.id("email")).sendKeys("devaraj.m.gowda90@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9845162083");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {

	}



}
