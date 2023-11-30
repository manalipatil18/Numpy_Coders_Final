package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import utilities.Helper;


public class DsportalgetstartStepdefinition extends Bclass {
	
	//HomePage fromhomePage = new HomePage();
	
   @Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	   fromhomePage = new HomePage(Helper.getDriver());  
	   fromhomePage.dsAlgo();
	   
	}
	   
	@When("clicks the Get Started button")
	public void clicks_the_get_started_button() {
		
	    fromhomePage.getStarted();
	   
	} 
	   
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	    
		fromhomePage.homePage();
	     
	} 
		
	
	@Given("The user clicks Data Structures drop down option1")
	public void the_user_clicks_data_structures_drop_down_option1() {
		fromhomePage = new HomePage(Helper.getDriver());  
		fromhomePage.dropdown();
	}

	@When("selects Array from list")
	public void selects_array_from_list() {
		fromhomePage.dsListArray();
	}

	@Then("Array alert msg without sign - You are not logged in")
	public void Array_alert_msg_without_sign_you_are_not_logged_in() {
		fromhomePage.alertLog();
	}

	
	@Given("The user clicks Data Structures drop down option2")
	public void the_user_clicks_data_structures_drop_down_option2() {
		fromhomePage = new HomePage(Helper.getDriver());  
		fromhomePage.dropdown();
		
	}

	@When("selects Linked List from list")
	public void  selects_Linked_List_from_list() {
		fromhomePage.dsListLinkedList();
	}
	
	@Then("Linked List alert msg without sign - You are not logged in")
	public void Linked_List_alert_msg_without_sign_you_are_not_logged_in() {
		fromhomePage.alertLog();
		
		
	}

	@Given("The user clicks Data Structures drop down option3")
	public void the_user_clicks_data_structures_drop_down_option3() {
		fromhomePage = new HomePage(Helper.getDriver());  
		fromhomePage.dropdown();
	   
	}

	@When("selects Stack from list")
	public void selects_stack_from_list() {
		fromhomePage.dsListStack();
	}
	
	@Then("Stack alert msg without sign - You are not logged in")
	public void Stack_alert_msg_without_sign_you_are_not_logged_in() {
		
	    fromhomePage.alertLog();
	}
	
	
	
	@Given("The user clicks Data Structures drop down option4")
	public void the_user_clicks_data_structures_drop_down_option_queue() {
		fromhomePage = new HomePage(Helper.getDriver());  
		fromhomePage.dropdown();
	}

	@When("selects Queue from list")
	public void selects_queue_from_list() {
	    fromhomePage.dsListQueue();
	}
	
	@Then("Queue alert msg without sign - You are not logged in")
	public void Queue_alert_msg_without_sign_you_are_not_logged_in() {
		
	    fromhomePage.alertLog();
	    
	}

	@Given("The user clicks Data Structures drop down option5")
	public void the_user_clicks_data_structures_drop_down_option_tree() {
		fromhomePage = new HomePage(Helper.getDriver());  
		fromhomePage.dropdown();
	}

	@When("selects Tree from list")
	public void selects_tree_from_list() {
		
		fromhomePage.dsListTree();
	}
	
	@Then("Tree alert msg without sign - You are not logged in")
	public void Tree_alert_msg_without_sign_you_are_not_logged_in() {
		
	    fromhomePage.alertLog();
	}
	
	
	@Given("The user clicks Data Structures drop down option6")
	public void the_user_clicks_data_structures_drop_down_option_graph() {
		fromhomePage = new HomePage(Helper.getDriver());  
		fromhomePage.dropdown();
	}

	@When("selects Graph from list")
	public void selects_graph_from_list() {
		
		fromhomePage.dsListGraph();
	}   
	
	@Then("Graph alert msg without sign - You are not logged in")
	public void Grapg_alert_msg_without_sign_you_are_not_logged_in() {
		
	    fromhomePage.alertLog();
	    Helper.tearDown();
	}
	
}	

	
   
  







