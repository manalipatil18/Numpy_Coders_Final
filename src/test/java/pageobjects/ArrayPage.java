package pageobjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import stepdefinition.Bclass;


public class ArrayPage extends Bclass{
	
	 By userNm =  By.name("username");
	 By passwRd =  By.name("password");
	 By submClick = By.xpath("//input[@type='submit' and @value='Login']");
	 By arrayPython = By.xpath("//a[text()='Arrays in Python']");
	 By getsartArray = By.xpath("//a[@href='array']");
	 By textarea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	 By array_list = By.xpath("//a[text()='Arrays Using List']");	
	 By basicOperns = By.xpath("//a[text()='Basic Operations in Lists']");
	 By application = By.xpath("//a[text()='Applications of Array']");
	 By practiceQs = By.xpath("//a[text()='Practice Questions']");
	 By searchArray = By.xpath("//a[text()='Search the array']");
	 By secondTextArea = By.cssSelector("div.CodeMirror textarea");
	 By maxCosecutive = By.xpath("//a[text()='Max Consecutive Ones']");
	 By findNumbers = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	 By sortedArray = By.xpath("//a[text()='Squares of  a Sorted Array']");
	
	private WebDriver chromedriver;
	public ArrayPage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}
	
	
   public void validLogin() {
		
		chromedriver.findElement(userNm).sendKeys("vijayBharathi22");
		chromedriver.findElement(passwRd).sendKeys("ds_algo22");
		chromedriver.findElement(submClick).click();
		
		}
   public void getStartButton() {
	   
	   chromedriver.findElement(getsartArray).click();
	   
   }
   
   public void arrayPgConfirmation() {
	   
	   String actualTitle = chromedriver.getTitle();
		String expectedTitle = "Array";
		Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
   }
   
   public void arrayInPython() {
	   
	   chromedriver.findElement(arrayPython).click();
	   
   }
   
   public void enterArrayString(DataTable table) {
	   
	   List<String> codedata = table.asList();
  	 String Coded = codedata.get(0);
   chromedriver.findElement(textarea).sendKeys(Coded);

   } 
   
  public void arraysInPythonCon_One() {
	   
	   String actualTitle = chromedriver.getTitle();
		String expectedTitle = "Arrays in Python";
		Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
	 }
   
   
   public void arrayUsingList() {
	   
	   chromedriver.findElement(array_list).click();
	   }
   
   public void arraysUsListEx(DataTable table1) {
   
	   List<String> codedata1 = table1.asList();
  	    String Code1 = codedata1.get(0);
  	  chromedriver.findElement(textarea).sendKeys(Code1);
}	
   
   public void arraysUsingListPgCon() {
      
	   String actualTitle = chromedriver.getTitle();
		String expectedTitle = "Arrays Using List";
		Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
	   
   }  
   
   public void basicOperations() {
	   
	   chromedriver.findElement(basicOperns).click();
	   
	   }
   
   public void basicOperationsEx(DataTable table2) {
	   
	   List<String> codedata2 = table2.asList();
 	    String Code2 = codedata2.get(0);
 	  chromedriver.findElement(textarea).sendKeys(Code2);
 	  
 	  }	 
   
   public void basicOperationsinListsCon() {
	   
	   String actualTitle = chromedriver.getTitle();
		String expectedTitle = "Basic Operations in Lists";
		Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
	   
	 }

   public void applicationsofArray() {
	   
	   chromedriver.findElement(application).click();
	     
   }
   
   public void applicationsofArrayEx(DataTable table3) {
	   
	   List<String> codedata3 = table3.asList();
	    String Code3 = codedata3.get(0);
	  chromedriver.findElement(textarea).sendKeys(Code3);
	  
 }
   
  public void practiceQues() {
	  
	  chromedriver.findElement(practiceQs).click(); 
	  
  }
  
  public void searchTheArray() {
	  
	  chromedriver.findElement(searchArray).click();
  }

  
 public void practiceQsOne() throws InterruptedException {
	   
 // chromedriver.findElement(secondTextArea).sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.DELETE));
	 chromedriver.findElement(secondTextArea).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
  //chromedriver.findElement(secondTextArea).sendKeys("def search(lst, value):", Keys.RETURN);
	 chromedriver.findElement(secondTextArea).sendKeys("def search(lst, value):", Keys.ENTER);
 // chromedriver.findElement(secondTextArea).sendKeys("if value in lst:", Keys.RETURN);
	 chromedriver.findElement(secondTextArea).sendKeys("if value in lst:", Keys.ENTER);
  //chromedriver.findElement(secondTextArea).sendKeys("return \"Element Found\"", Keys.RETURN) ;
	 chromedriver.findElement(secondTextArea).sendKeys("return \"Element Found\"", Keys.ENTER) ;
	 
 //chromedriver.findElement(secondTextArea).sendKeys("else:", Keys.RETURN) ;
	 chromedriver.findElement(secondTextArea).sendKeys("else:", Keys.ENTER) ;
// chromedriver.findElement(secondTextArea).sendKeys("return \"Not Found\"", Keys.RETURN) ;
	 chromedriver.findElement(secondTextArea).sendKeys("return \"Not Found\"", Keys.ENTER) ;
 chromedriver.findElement(secondTextArea).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
 //chromedriver.findElement(secondTextArea).sendKeys("print(\"Check for found: \"+search([12, 23, 45, 67, 6, 90],12))",
//		  Keys.RETURN);
 chromedriver.findElement(secondTextArea).sendKeys("print(\"Check for found: \"+search([12, 23, 45, 67, 6, 90],12))",
		  Keys.ENTER);
 chromedriver. findElement(secondTextArea)
		  . sendKeys("print (\"Check for found: \" +search([12, 23, 45, 67, 6, 90],25))");
 
 Thread.sleep(300);
 //return this;
 
  }
  
  public void enterArrayStringNegative(DataTable table5) {
	   
	   List<String> codedata5 = table5.asList();
 	 String Coded5 = codedata5.get(0);
  chromedriver.findElement(textarea).sendKeys(Coded5);

  } 
  
 public void enterArrayStringInvalidMsg() throws InterruptedException {
  
  Alert alert = chromedriver.switchTo().alert();
	String alertMessage= chromedriver.switchTo().alert().getText(); 
	System.out.println(alertMessage); 
	Thread.sleep(1000);
	alert.accept();
  }
  
  public void arraysUsListExNegative(DataTable table6) {
	 
	  List<String> codedata6 = table6.asList();
	 String Coded6 = codedata6.get(0);
 chromedriver.findElement(textarea).sendKeys(Coded6); 
	  
  }
  
  public void maxConsecutiveOnes() {
	  
	  chromedriver.findElement(maxCosecutive).click(); 
  }
  
  public void findNumbersLink() {
	  
	  chromedriver.findElement(findNumbers).click();
	}
  
  public void sortedArrayLink() {
	  
    chromedriver.findElement(sortedArray).click();
  }
  
  public void basicOperationNegative(DataTable table7) {
	  
	  List<String> codedata7 = table7.asList();
		 String Coded7 = codedata7.get(0);
	 chromedriver.findElement(textarea).sendKeys(Coded7); 
	  
  }
  
  public void applicationsofArrayNegative(DataTable table8) {
	  
	  List<String> codedata8 = table8.asList();
		 String Coded8 = codedata8.get(0);
	 chromedriver.findElement(textarea).sendKeys(Coded8); 
 }
  

}
   
 
   
   


   
   
   







