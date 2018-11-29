package Cucumber1.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	//create an object 
	WebDriver driver;
	
	// 2 .add a cucumber hook before any of the given when then will get  implemented @before
	@Before
	//3 add a method and  the body of the method {} you add 
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ukcci1eng\\Desktop\\Cucumber1\\Cucumber1\\src\\test\\java\\Cucumber1\\resources\\chromedriver.exe");
		//call driver object
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		
		
	}
	@After 
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	
	
	//1. given when then entered
	@Given("^User navigates to  livedooh website$")
	public void user_navigates_to_livedooh_website() throws Throwable {
		driver.get("https://cci-uat.livedooh.com");
		System.out.println("Method1");
	}

	@And ("^User clicks on the login button on Homepage$")
	public void user_clicks_on_the_login_button_on_Homepage() throws Throwable {
		Thread.sleep(2000);
		driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/input[1]")).click();
	
	}

	@And ("^User enters a valid  username$")
	public void user_enters_a_valid_username() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/input[1]").sendKeys("BE-Emma");
	
	}

	@And("^User enters a valid  password$")
	public void user_enters_a_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/input[1]").sendKeys("emma");
		driver.
		System.out.println("Method4");
	}

	@When("^User clicks on  the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/input[1]")).click();
	}

	@Then("^User should be taken to the succesful login page$")
	public void user_should_be_taken_to_the_succesful_login_page() throws Throwable {
		Thread.sleep(2000);
		WebElement askQuestionButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[2]/a/span"));
		Assert.assertEquals(actual, expected);
	}

}
