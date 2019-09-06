package Sangeeth.CaseStudy_Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs4 {
	WebDriver driver;
	@Given("User opens TestMeApp")
	public void user_opens_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Desktop\\Sangeeth\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();	  
	}

	@When("user search for product {string}")
	public void user_search_for_product(String string) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	}

	@When("User clicks the search button")
	public void user_clicks_the_search_button() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
	 
	}

	@When("User add the product to the cart")
	public void user_add_the_product_to_the_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    
	}

	@Then("User checks whether it directs to the login page")
	public void user_checks_whether_it_directs_to_the_login_page() {
		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("Case_Study Passed");
	   
	}


}
