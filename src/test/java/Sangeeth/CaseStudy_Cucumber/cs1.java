package Sangeeth.CaseStudy_Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs1 {
	WebDriver driver;
	@Given("Open the TestMeApp to Register")
	public void open_the_TestMeApp_to_Register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Sangeeth\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	 
	@When("User click SignUp button")
	public void user_click_SignUp_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("Enter the username {string}")
	public void enter_the_username(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@When("Enter the Firstname {string}")
	public void enter_the_Firstname(String string) {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);
	}

	@When("Enter the Lastname {string}")
	public void enter_the_Lastname(String string) {
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string); 
	}

	@When("Enter the Password {string}")
	public void enter_the_Password(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@When("Enter the ConfrimPassword {string}")
	public void enter_the_ConfrimPassword(String string) {
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);
	}

	@When("Select the Gender")
	public void select_the_Gender() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	    
	}

	@When("Enter the Email {string}")
	public void enter_the_Email(String string) {
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);
	}

	@When("Enter the Mobile Number {string}")
	public void enter_the_Mobile_Number(String string) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);
	}

	@When("Enter the DOB {string}")
	public void enter_the_DOB(String string) {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select b = new Select(month);
		b.selectByValue("4");
		
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select c = new Select(year);
		c.selectByValue("1998");
		
		WebElement date = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		date.findElement(By.linkText("5")).click();
	}

	@When("Enter the Address {string}")
	public void enter_the_Address(String string) {
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);
	}

	@When("Select the Security Question")
	public void select_the_Security_Question() {
		Select d = new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
		d.selectByIndex(0);
	}

	@When("Enter the Answer {string}")
	public void enter_the_Answer(String string) {
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	}

	@Then("User click the register button")
	public void user_click_the_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}


}
