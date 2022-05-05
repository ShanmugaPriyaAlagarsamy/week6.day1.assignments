package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("opens Leaftaps main page to create lead")
	public void opens_leaftaps_main_page_to_create_lead() {
	   
		System.out.println("Lead is created successfully");
	}
	
	@When("Click on Create Lead button")
	public void click_on_create_lead_button() {
	 
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		}
	@Then("opens Create Lead page")
	public void opens_create_lead_page() {
	   String title1 = driver.getTitle();
	   System.out.println(title1 + "is opened successfully");
	   
	}
	
	@Given("Enter the Company name as {string}")
	public void enter_the_company_name_as(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
			
	@Given("Enter the First name as {string}")
	public void enter_the_first_name_as(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			}
	@Given("Enter the Last name as {string}")
	public void enter_the_last_name_as(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		
	}
	@When ("Click on submit button")
	public void click_on_submit_button()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead is created successfully")
	public void lead_is_created_successfully() {
		String title = driver.getTitle();
		System.out.println("The title is " + title );
	  
	}

}
