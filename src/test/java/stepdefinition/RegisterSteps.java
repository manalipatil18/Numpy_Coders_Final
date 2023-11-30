package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import jdk.vm.ci.code.Register;
import pageobjects.RegisterPage;
import utilities.Helper;

public class RegisterSteps extends Bclass{
	
	 WebDriver driver;
	 //RegisterPage fromregisterjava;
	 
	 
	@Given("^The user opens Register Page")
	public void the_user_opens_register_page() {
		
		System.out.println("We are on the register page");
		fromregisterjava = new RegisterPage(Helper.getDriver());
	//	fromregisterjava = new RegisterPage();
		fromregisterjava.registerPage();
		
	}

	@When("^The user enters (.*), (.*) and (.*)$")
	public void the_user_enters_q_atesters(String username, String password, String confirmpassword) {
		
		//fromregisterjava = new RegisterPage();
		
		fromregisterjava.registerClick();
		
       fromregisterjava.sendUserName(username);
		fromregisterjava.sendPassword(password);
		fromregisterjava.sendConfirmation(confirmpassword);
		
		
		 }
	
			
    @And("Clicks on register button")
	public void clicks_on_register_button() {
    	
    	//fromregisterjava = new RegisterPage();
    	
		System.out.println("Click on register button"); 
		fromregisterjava.register();
		
		
	}
    
    @Then("User gets instruction")
    public void user_gets_instruction() {
    	
    	//fromregisterjava = new RegisterPage(); 
    	
    	System.out.println("The user gets _please fill out this field_ instruction ");
    }
    
    
    @Then("The user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	//	fromregisterjava = new RegisterPage();
    	fromregisterjava = new RegisterPage(Helper.getDriver());
		fromregisterjava.successMsg();
	    
	}

	@Then("The User gets an error message for password missmatch")
	public void the_user_gets_an_error_message_for_password_missmatch() {
	    
	//	fromregisterjava = new RegisterPage();
		fromregisterjava = new RegisterPage(Helper.getDriver());
		fromregisterjava.pwdmissMatch();
		//Helper.tearDown();
	
	}


	@Then("User should see an error msg user is already resgisered")
	public void User_should_see_an_error_msg_user_is_already_resgisered() {
	    
		fromregisterjava = new RegisterPage(Helper.getDriver());
		fromregisterjava.Reregister();
		Helper.tearDown();
	
	}
	

	

	

	

	

	

}
