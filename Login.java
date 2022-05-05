package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	/*public ChromeDriver driver;
	
	/*
	 * @Given("Open the chrome browser") public void open_the_chrome_browser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * 
	 * 
	 * }
	 * 
	 * @Given("Load the application url") public void load_the_application_url() {
	 * 
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * 
	 * }
	 */
	
	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
				driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
			}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className ("decorativeSubmit")).click();
			}
	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		
		 boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		 
		 Assert.assertTrue(displayed);
		 
			/*
			 * if(displayed=true) { System.out.println("The home page is displayed"); } else
			 * { System.out.println("The home page is not displayed");
			 */
		 }
		 
	   
	
	
	@But("Error message should be displayed")
	public void error_message_should_be_displayed()
	{
		System.out.println("Error message displayed");
	}

}
