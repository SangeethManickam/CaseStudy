package Sangeeth.CaseStudy_Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs3 {
	WebDriver driver;
	@Given("User opens the TestMeApp")
	public void user_opens_the_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Desktop\\Sangeeth\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.manage().window().maximize();	    
	}

	@When("user search for the product {string}")
	public void user_search_for_the_product(String string) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);;
		//WebElement search = driver.findElement(By.id("//*[@id=\"myInput\"]"));
		//Actions A = new Actions(driver);
		//A.keyDown(search,Keys.SHIFT).perform();
		//A.sendKeys("H").pause(2000).sendKeys("e").pause(2000).sendKeys("a").pause(2000).sendKeys("d").pause(2000).perform();
		//A.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Head')]"))).click().perform();
	  
	}

	@When("Select the product headphones")
	public void select_the_product_headphones() {
	
	}

	@When("Click FindDetails")
	public void click_FindDetails() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   
	}

	@Then("Add the product to the Cart")
	public void add_the_product_to_the_Cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    
	}


}
