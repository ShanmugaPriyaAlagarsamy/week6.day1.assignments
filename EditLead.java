package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	
	@When("Click on Edit button")
	public void click_on_edit_button() {
		
		driver.findElement(By.linkText("Edit")).click();
	}
	@Then("Edit Lead page is displayed")
	public void edit_lead_page_is_displayed() {
	
		String editLeadTitle = driver.getTitle();
		System.out.println(editLeadTitle + "is opened successfully");
	}
	@Given("Enter description")
	public void enter_description() {
	   
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("enter cumcumber learning in description");
	}
	@Given("Enter Important note")
	public void enter_important_note() {
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note to team is to complete testing in 2 days");
	}
	
	@When("Click submit button")
	public void click_submit_button() {
		driver.findElement(By.name("submitButton")).click();  
	}
	
	@Then("Lead page is opened with updated details")
	public void lead_page_is_opened_with_updated_details() {
		System.out.println("The lead details are updated and viewed in tha page: " + driver.getTitle());
				
	}

}
