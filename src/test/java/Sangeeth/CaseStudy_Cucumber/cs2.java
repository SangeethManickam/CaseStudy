package Sangeeth.CaseStudy_Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs2 {
	WebDriver driver;
	@Given("user open the TestMeApp")
	public void user_open_the_TestMeApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\training_c2a.04.29\\\\Desktop\\\\Sangeeth\\\\Drivers\\\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("User click the signin button")
	public void user_click_the_signin_button() {
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("Enter the {string}")
	public void enter_the(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	    
	}

	@When("Enter password the {string}")
	public void enter_password_the(String string) {
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@Then("click the signin button")
	public void click_the_signin_button() {
	   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}


}
