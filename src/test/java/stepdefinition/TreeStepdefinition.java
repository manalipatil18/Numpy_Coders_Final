package stepdefinition;

import java.io.IOException;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Tree;
import utilities.Helper;

public class TreeStepdefinition extends Bclass {
	     
   // Tree tree = new Tree();
	
	@Given("User is logged in and on Home Page for Tree")
	public void User_is_logged_in_and_on_home_page_for_Tree() {
		tree= new Tree(Helper.getDriver());
		tree.openHomePage();
		tree.validateLogin();
    }

	@When("User clicks on Tree Get started button or from drop menu tree item")
	public void User_clicks_on_Tree_Get_started_button_or_from_drop_menu_tree_item() {
		tree.treeGetStarted();
		tree.navigate();
		tree.dropdown();
		tree.listTree();
	}

	@Then("User is on tree Intro page")
	public void User_is_on_tree_intro_page() {
		tree.treePageAssert();
	}
	
	@Given("User is on Tree page for clicks Overview of Trees")
	public void user_is_on_tree_page_for_clicks_overview_of_trees() {
		tree= new Tree(Helper.getDriver());
	    tree.treePageAssert();
	}

	@When("Tree user clicks on Overview of Tree")
	public void tree_user_clicks_on_overview_of_tree() {
	   tree.overviewTreesClick();
	}

	@And("Tree User clicks on try here")
	public void tree_user_clicks_on_try_here() {
	    tree.tryHere();
	}

	@Then("Tree User lands on tryEditor page")
	public void tree_user_lands_on_try_editor_page() {
	    tree.onTryeditorpage();
	}

	@Given("Tree User is on tryEditor page")
	public void tree_user_is_on_try_editor_page() {
		tree= new Tree(Helper.getDriver());
	    tree.onTryeditorpage();
	}

	@When("Tree The user enters sheet {string} and {int}")
	public void tree_the_user_enters_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	   tree.Readinvalidcode(Sheetname, RowNumber);
	}

	@And("Tree User clicks Run to execute code")
	public void tree_user_clicks_run_to_execute_code() {
	   tree.runBtn();
	}

	@Then("Tree User gets a error message and dismisses it")
	public void tree_user_gets_a_error_message_and_dismisses_it() throws InterruptedException {
	   tree.inValidOutputMessage();
	}

	@Given("Tree User is on tryEditor page for python code")
	public void tree_user_is_on_try_editor_page_for_python_code() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
		tree.tryHere();
	   
	}

	@When("Tree The user enters valid sheet {string} and {int}")
	public void tree_the_user_enters_valid_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	    tree.Readinvalidcode(Sheetname, RowNumber);
	}

	@And("Tree User clicks Run to execute valid code")
	public void tree_user_clicks_run_to_execute_valid_code() {
	   tree.runBtn();
	}

	@Then("Tree User gets a valid output")
	public void tree_user_gets_a_valid_output() {
	    tree.validOp();
	}

	@Given("User is on Tree page for clicks Terminologies")
	public void user_is_on_tree_page_for_clicks_terminologies() {
		tree= new Tree(Helper.getDriver());
	    tree.navigate();
	}

	@When("user clicks on Terminologies")
	public void user_clicks_on_terminologies() {
	    tree.terminologiesClick();
	}

	@Given("User is on Tree page for clicks Types of Trees")
	public void user_is_on_tree_page_for_clicks_types_of_trees() {
		tree= new Tree(Helper.getDriver());
	   tree.navigate();
	}

	@When("user clicks on Types of Trees")
	public void user_clicks_on_types_of_trees() {
	    tree.typesOfTreesClick();
	}

	@Given("User is on Tree page for clicks Tree Traversals")
	public void user_is_on_tree_page_for_clicks_tree_traversals() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Tree Traversals")
	public void user_clicks_on_tree_traversals() {
	    tree.treeTraversalsClick();
	}

	@Given("User is on Tree page for clicks Traversals-Illustration")
	public void user_is_on_tree_page_for_clicks_traversals_illustration() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Traversals-Illustration")
	public void user_clicks_on_traversals_illustration() {
	   tree.traversalsIllustrationClick();
	}

	@Given("User is on Tree page for clicks Binary Trees")
	public void user_is_on_tree_page_for_clicks_binary_trees() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Binary Trees")
	public void user_clicks_on_binary_trees() {
	    tree.binaryTreesClick();
	}

	@Given("User is on Tree page for clicks Types of Binary Trees")
	public void user_is_on_tree_page_for_clicks_types_of_binary_trees() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Types of Binary Trees")
	public void user_clicks_on_types_of_binary_trees() {
	   tree.typesOfBinaryTreesClick();
	}

	@Given("User is on Tree page for clicks Implementation in Python")
	public void user_is_on_tree_page_for_clicks_implementation_in_python() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Implementation in Python")
	public void user_clicks_on_implementation_in_python() {
	    tree.implementationInPythonClick();
	}

	@Given("User is on Tree page for clicks Binary Tree Traversals")
	public void user_is_on_tree_page_for_clicks_binary_tree_traversals() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Binary Tree Traversals")
	public void user_clicks_on_binary_tree_traversals() {
	  tree.binaryTreeTraversalsClick();
	}

	@Given("User is on Tree page for clicks Implementation of Binary Trees")
	public void user_is_on_tree_page_for_clicks_implementation_of_binary_trees() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Implementation of Binary Trees")
	public void user_clicks_on_implementation_of_binary_trees() {
	    tree.implementationOfBinaryTreesClick();
	}

	@Given("User is on Tree page for clicks Applications of Binary trees")
	public void user_is_on_tree_page_for_clicks_applications_of_binary_trees() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Applications of Binary trees")
	public void user_clicks_on_applications_of_binary_trees() {
	    tree.applicationsOfBinaryTreesClick();
	}

	@Given("User is on Tree page for clicks Binary Search Trees")
	public void user_is_on_tree_page_for_clicks_binary_search_trees() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Binary Search Trees")
	public void user_clicks_on_binary_search_trees() {
	  tree.binarySearchTreesClick();
	}

	@Given("User is on Tree page for clicks Implementation Of BST")
	public void user_is_on_tree_page_for_clicks_implementation_of_bst() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("user clicks on Implementation Of BST")
	public void user_clicks_on_implementation_of_bst() {
	    tree.implementationOfBstClick();
	}

	@Given("User is on Tree page for clicks Practice Questions")
	public void user_is_on_tree_page_for_clicks_practice_questions() {
		tree= new Tree(Helper.getDriver());
		tree.navigate();
	}

	@When("Tree user clicks on practice questions")
	public void tree_user_clicks_on_practice_questions() {
	   tree.practiceQuestionsClick();
	}

	@Then("Tree User lands on practice page")
	public void tree_user_lands_on_practice_page() {
	   tree.pacticeQuesAssert();
	   Helper.tearDown();
	}



	
}	
	