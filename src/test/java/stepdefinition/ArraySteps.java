package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ArrayPage;
import utilities.Helper;
import io.cucumber.datatable.DataTable;
  

public class ArraySteps extends Bclass{
	
	
	@Given("The user is in the homepage after logged in")
	public void the_user_is_in_the_homepage_after_logged_in() {
		
		fromarrayjava = new ArrayPage (Helper.getDriver());
		Helper.openPage();
		fromarrayjava.validLogin();
	    
	}

	@When("The user clicks the Get Started button in Array Panel")
	public void the_user_clicks_the_get_started_button_in_array_panel() {
		
		fromarrayjava.getStartButton();
	    
		}

	@Then("The user redirected to ARRAY Data Structure Page")
	public void the_user_redirected_to_array_data_structure_page() {
		
		fromarrayjava.arrayPgConfirmation();
	    
		
	}

	@Given("The user is in the Array page after logged in")
	public void the_user_is_in_the_array_page_after_logged_in() {
	    
		
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
		
		fromarrayjava = new ArrayPage (Helper.getDriver());
		fromarrayjava.arrayInPython();
	}
	

	@And("The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page(String string) {
		
		Helper.Tryherebttn();
		
}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test(DataTable DataTable) throws InterruptedException {
		
		fromarrayjava.enterArrayString(DataTable );
		Helper.RunBtn();
		Helper.NavBack();
	}
	
  @Given("The user is in the Arrays in Python page after navigating back from tryEditor")
	public void the_user_is_in_the_arrays_in_python_page_after_navigating_back_from_try_editor() {
		
		fromarrayjava = new ArrayPage (Helper.getDriver());
		fromarrayjava.arraysInPythonCon_One();
		
	}

	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		
		fromarrayjava.arrayUsingList();
	}

	@And("The user clicks {string} button in Arrays Using List page")
	public void the_user_clicks_button_in_arrays_using_list_page(String string) {
	    
		Helper.Tryherebttn();
		
	}
	
 @Then("The user should be redirected to tryEditor page")
	public void the_user_should_be_redirected_to_try_editor_page(DataTable DataTable) throws InterruptedException {
	    
	  fromarrayjava.arraysUsListEx(DataTable);
    Helper.RunBtn();
      Helper.NavBack();
      
      }
	
	@Given("The user is in the Arrays Using List page after navigating back from tryEditor")
	public void the_user_is_in_the_arrays_using_list_page_after_navigating_back_from_try_editor() {
		
		fromarrayjava = new ArrayPage (Helper.getDriver());
		fromarrayjava.arraysUsingListPgCon();
		
	}

	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {
	    
		fromarrayjava.basicOperations();
		
	}

	@And("The user clicks {string} button in Basic Operations in Lists page")
	public void the_user_clicks_button_in_basic_operations_in_lists_page(String string) {
		
		Helper.Tryherebttn();
	    
	}

	@Then("The user should be redirected to the next page")
	public void the_user_should_be_redirected_to_the_next_page(DataTable DataTable) throws InterruptedException {
		fromarrayjava.basicOperationsEx(DataTable);
		Helper.RunBtn();
	    Helper.NavBack();
		
	}
	
	@Given("The user is in the Basic Operations in Lists page after navigating back from tryEditor")
	public void the_user_is_in_the_basic_operations_in_lists_page_after_navigating_back_from_try_editor() {
		
		fromarrayjava = new ArrayPage (Helper.getDriver());
		fromarrayjava.basicOperationsinListsCon();
	
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		
		fromarrayjava.applicationsofArray();
	    
	}

	@And("The user clicks {string} button in Applications of Array page")
	public void the_user_clicks_button_in_applications_of_array_page(String string) {
		
		Helper.Tryherebttn();
		
	}

   @Then("The user should be redirected to the new page having an tryEditor and a Run button.")
	public void the_user_should_be_redirected_to_the_new_page_having_an_try_editor_and_a_run_button(DataTable DataTable) throws InterruptedException {
	       
	   fromarrayjava.applicationsofArrayEx(DataTable);
	   Helper.RunBtn();
	    Helper.NavBack();
		
	}
   
   @Given("The user is in the Applications of Array page after navigating back from tryEditor")
   public void the_user_is_in_the_applications_of_array_page_after_navigating_back_from_try_editor() {
	   
	   fromarrayjava = new ArrayPage (Helper.getDriver());
	   
   }

   @When("The user clicks on Practice Questions link")
   public void the_user_clicks_on_practice_questions_link() {
	   
	   fromarrayjava.practiceQues();
	   
   }

   @And("The user clicks on the Search the array link")
   public void the_user_clicks_on_the_search_the_array_link() {
       
	   fromarrayjava.searchTheArray();
   }

   @Then("The user should be redirected to the new page having one question on the left side and tryEditor, Run button.")
   public void the_user_should_be_redirected_to_the_new_page_having_one_question_on_the_left_side_and_try_editor_run_button() throws InterruptedException {
	   
	   fromarrayjava.practiceQsOne();
	   Helper.RunBtn();
	   Helper.NavBack();
   
   }
   
   @Given("Given The user is in the Applications of Array page after testing the positive scenarios")
   public void given_the_user_is_in_the_applications_of_array_page_after_testing_the_positive_scenarios() {
       
	   fromarrayjava = new ArrayPage (Helper.getDriver());
   }

   @When("The user clicks on Arrays in Python for testing negative input")
   public void the_user_clicks_on_arrays_in_python_for_testing_negative_input() {
       
	   fromarrayjava.arrayInPython();
	 }

   @When("The user clicks on Try here button for entering negative input")
   public void the_user_clicks_on_try_here_button_for_entering_negative_input() {
	   
	   Helper.Tryherebttn();
	   
   }

   @Then("User navigates to tryEditer page for entering Arrays in Python_negative input")
   public void user_navigates_to_try_editer_page_for_entering_arrays_in_python_negative_input(DataTable DataTable) throws InterruptedException {
	   
	   fromarrayjava.enterArrayStringNegative(DataTable);
	   Helper.RunBtn();
	   fromarrayjava.enterArrayStringInvalidMsg();
		Helper.NavBack();
	   
   }
   
   @Given("Given The user is in the Applications of Array page after testing the negative scenarios")
   public void given_the_user_is_in_the_applications_of_array_page_after_testing_the_negative_scenarios() {
       
	   fromarrayjava = new ArrayPage (Helper.getDriver());
   }

   @When("The user clicks on Arrays Using List for testing negative input")
   public void the_user_clicks_on_arrays_using_list_for_testing_negative_input() {
	   
	   fromarrayjava.arrayUsingList();
	   
   }

   @When("The user clicks on Try here button for entering negative values in the tryEditor page")
   public void the_user_clicks_on_try_here_button_for_entering_negative_values_in_the_try_editor_page() {
       
	   Helper.Tryherebttn();
   }

   @Then("User navigates to tryEditer page for entering Arrays Using List_ invalid inputs")
   public void user_navigates_to_try_editer_page_for_entering_arrays_using_list_invalid_inputs(DataTable DataTable) throws InterruptedException {
       
	   fromarrayjava.arraysUsListExNegative(DataTable);
	   Helper.RunBtn();
	   fromarrayjava.enterArrayStringInvalidMsg();
		Helper.NavBack();
	   }
   
   @Given("The user is in the Practice question page after navigating back from Search the array tryEditor")
   public void the_user_is_in_the_practice_question_page_after_navigating_back_from_search_the_array_try_editor() {
       
	   fromarrayjava = new ArrayPage (Helper.getDriver());
	   
   }

   @When("The user clicks on Max consecutive ones link")
   public void the_user_clicks_on_max_consecutive_ones_link() {
       
	   fromarrayjava.maxConsecutiveOnes();
   }

   @Then("The user should be redirected to the new page having one question related with Max consecutive ones")
   public void the_user_should_be_redirected_to_the_new_page_having_one_question_related_with_max_consecutive_ones() throws InterruptedException {
       
	   fromarrayjava.practiceQsOne();
	   Helper.RunBtn();
	   Helper.NavBack();
	   
   }
   
   @Given("The user is in the Practice question page after navigating back from Max consecutive ones tryEditor")
   public void the_user_is_in_the_practice_question_page_after_navigating_back_from_max_consecutive_ones_try_editor() {
       
	   fromarrayjava = new ArrayPage (Helper.getDriver());
	   
   }

   @When("The user clicks on the Find numbers with even number of digits link")
   public void the_user_clicks_on_the_find_numbers_with_even_number_of_digits_link() {
       
	   fromarrayjava.findNumbersLink();
   }

   @Then("The user should be redirected to the new page having one question related to the corresponding topic")
   public void the_user_should_be_redirected_to_the_new_page_having_one_question_related_to_the_corresponding_topic() throws InterruptedException {
       
	   fromarrayjava.practiceQsOne();
	   Helper.RunBtn();
	   Helper.NavBack();
  }
   
   @Given("The user is in the Practice question page after navigating back from Find numbers with even number of digits tryEditor")
   public void the_user_is_in_the_practice_question_page_after_navigating_back_from_find_numbers_with_even_number_of_digits_try_editor() {
	   
	   fromarrayjava = new ArrayPage (Helper.getDriver());
   }

   @When("The user clicks on the Squares of a sorted Array link")
   public void the_user_clicks_on_the_squares_of_a_sorted_array_link() {
       
	   fromarrayjava.sortedArrayLink();
   }

   @Then("The user should be redirected to the new page having one question related to Squares of a sorted Array topic")
   public void the_user_should_be_redirected_to_the_new_page_having_one_question_related_to_squares_of_a_sorted_array_topic() throws InterruptedException {
       
	   fromarrayjava.practiceQsOne();
	   Helper.RunBtn();
	   Helper.NavBack();
	   Helper.NavBack();
}
   
   @Given("The user is in the Applications of Array page after testing the negative scenarios of Arrays Using List")
   public void the_user_is_in_the_applications_of_array_page_after_testing_the_negative_scenarios_of_arrays_using_list() {
       
	   fromarrayjava = new ArrayPage (Helper.getDriver());
   }

   @When("The user clicks on Basic Operations in Lists link for testing negative values")
   public void the_user_clicks_on_basic_operations_in_lists_link_for_testing_negative_values() {
       
	   fromarrayjava.basicOperations();
   }

   @And("The user clicks on Try here button for entering negative values for the third time")
   public void the_user_clicks_on_try_here_button_for_entering_negative_values_for_the_third_time() {
       
	   Helper.Tryherebttn();
   }

   @Then("User navigates to tryEditer page for entering Basic Operations in Lists invalid inputs")
   public void user_navigates_to_try_editer_page_for_entering_basic_operations_in_lists_invalid_inputs(DataTable DataTable) throws InterruptedException {
       
	   fromarrayjava.basicOperationNegative(DataTable);
	   Helper.RunBtn();
	   fromarrayjava.enterArrayStringInvalidMsg();
	   Helper.NavBack();
	}

   @Given("The user is in the Applications of Array page after testing the negative scenarios of Basic Operations in Lists")
   public void the_user_is_in_the_applications_of_array_page_after_testing_the_negative_scenarios_of_basic_operations_in_lists() {
       
	   fromarrayjava = new ArrayPage (Helper.getDriver());
   }

   @When("The user clicks on Applications of Array link for testing negative values")
   public void the_user_clicks_on_applications_of_array_link_for_testing_negative_values() {
       
	   fromarrayjava.applicationsofArray();
   }

   @And("The user clicks on Try here button for entering negative values for the fourth time")
   public void the_user_clicks_on_try_here_button_for_entering_negative_values_for_the_fourth_time() {
       
	   Helper.Tryherebttn();
   }

   @Then("User navigates to tryEditer page for entering Applications of Array link invalid inputs")
   public void user_navigates_to_try_editer_page_for_entering_applications_of_array_link_invalid_inputs(DataTable DataTable) throws InterruptedException {
       
	   fromarrayjava.applicationsofArrayNegative(DataTable);
	   Helper.RunBtn();
	   fromarrayjava.enterArrayStringInvalidMsg();
	   Helper.NavBack();
	   Helper.tearDown();
	   
   }

   
   
   
   
   
   
   
   
   
   
 
}
