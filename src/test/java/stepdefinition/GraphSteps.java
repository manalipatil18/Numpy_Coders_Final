package stepdefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.GraphPage;
import utilities.Helper;

public class GraphSteps extends Bclass{
	
	//private String Sheetname;
	//private Integer RowNumber;

	@Given("The user entered the homepage after logged in")
	public void the_user_is_in_the_homepage_after_logged_in() {
		
		fromgraphjava = new GraphPage (Helper.getDriver());
		Helper.openPage();
		Helper.ValidLogin();
	    
	}
	
	@When("The user clicks on the drop down button and clicks on graph")
	public void the_user_clicks_on_the_drop_down_button_and_clicks_on_graph() {

		fromgraphjava.dropdown();
		fromgraphjava.dsListGraph();
		
		}

	@Then("The user redirected to Graph Data Structure Page")
	public void the_user_redirected_to_graph_data_structure_page() {
	    
}
	
	@Given("The user is in Graph data structure page")
	public void the_user_is_in_graph_data_structure_page() {
	    
		fromgraphjava = new GraphPage (Helper.getDriver());
		fromgraphjava.graphPageConf();
		
	}

	@And("User clicks on Graph link and Try here button in the next page")
	public void user_clicks_on_graph_link_and_try_here_button_in_the_next_page() {
		
		fromgraphjava.graphLinkClick();
		Helper.Tryherebttn();
		
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		
		fromgraphjava = new GraphPage (Helper.getDriver());
		
		fromgraphjava.ReadData(Sheetname, RowNumber);
		
	}

	@And("User Clicks on Run button and handles the Alert message")
	public void user_clicks_on_run_button_and_handles_the_alert_message() throws InterruptedException {
	   
		Helper.RunBtn();
		fromgraphjava.enterGraphStringInvalidMsg();
		Helper.NavBack();
		
	}

	@Then("User navigates back to the previous page")
	public void user_navigates_back_to_the_previous_page() {
		Helper.NavBack();
		
	}

	@Given("The user is in Graph data structure page after testing invalid input")
	public void the_user_is_in_graph_data_structure_page_after_testing_invalid_input() {
	    
		fromgraphjava = new GraphPage (Helper.getDriver());
		fromgraphjava.graphLinkClick();
	}

	@And("User clicks Try here button and navigates to the next page")
	public void user_clicks_try_here_button_and_navigates_to_the_next_page() {
	    
		Helper.Tryherebttn();
	}

	@When("The user enters sheet {string} and {int} for testing valid values")
	public void the_user_enters_sheet_and_for_testing_valid_values(String Sheetname, Integer RowNumber) throws InvalidFormatException, InterruptedException, IOException {
	    
		fromgraphjava = new GraphPage (Helper.getDriver());
		fromgraphjava.ReadData(Sheetname, RowNumber);
		Helper.RunBtn();
		//fromgraphjava.enterGraphStringInvalidMsg();
	}

	@Then("User gets the output and navigates back.")
	public void user_gets_the_output_and_navigates_back() {
	   
		Helper.NavBack();
		Helper.NavBack();
		}

	@Given("The user is in Graph data structure page after testing one set of inputs")
	public void the_user_is_in_graph_data_structure_page_after_testing_one_set_of_inputs() {
	    
		fromgraphjava = new GraphPage (Helper.getDriver());
	    
	}

	@And("User clicks on Graph Representations link and Try here button in the next page")
	public void user_clicks_on_graph_representations_link_and_try_here_button_in_the_next_page() {
	    
		fromgraphjava.graphRepLink();
		Helper.Tryherebttn();
	}

	@When("The user enters sheet {string} and {int} for testing invalid values")
	public void the_user_enters_sheet_and_row_number_for_testing_invalid_values(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	    
          fromgraphjava = new GraphPage (Helper.getDriver());
		  fromgraphjava.ReadData(Sheetname, RowNumber);
		
	}

	@And("User Clicks on Run button")
	public void user_clicks_on_run_button() throws InterruptedException {
	    
		Helper.RunBtn();
	}

	@Then("User handles the alert and  navigates back to the previous page")
	public void user_handles_the_alert_and_navigates_back_to_the_previous_page() throws InterruptedException {
	    
		fromgraphjava.enterGraphStringInvalidMsg();
		Helper.NavBack();
	}

	@Given("The user is in Graph Representations page after testing invalid values")
	public void the_user_is_in_graph_representations_page_after_testing_invalid_values() {
	    
		fromgraphjava = new GraphPage (Helper.getDriver());
		fromgraphjava.graphRepConf();
		
	}

	@And("User clicks Try here button and navigates to the next page for testing positive inputs.")
	public void user_clicks_try_here_button_and_navigates_to_the_next_page_for_testing_positive_inputs() {
	    
		Helper.Tryherebttn();
	}

	@When("The user enters sheet {string} and {int} for the fourth time")
	public void the_user_enters_sheet_and_for_the_fourth_time(String Sheetname, Integer RowNumber) throws InvalidFormatException, InterruptedException, IOException {
	    
		fromgraphjava = new GraphPage (Helper.getDriver());
		
		 fromgraphjava.ReadData(Sheetname, RowNumber);
		 Helper.RunBtn();
		// fromgraphjava.enterGraphStringInvalidMsg();
	}

	@Then("User gets the output")
	public void user_gets_the_output() {
		Helper.NavBack();
		Helper.tearDown();
	}
	
	
	
	
	

}
