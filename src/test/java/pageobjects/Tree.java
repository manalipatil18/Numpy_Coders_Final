package pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import stepdefinition.Bclass;
import utilities.ExcelReader;

public class Tree extends Bclass{
	//static WebDriver driver ; 
	private WebDriver driver;
	public Tree(WebDriver driver) {
		this.driver = driver;
	}
	
	private static final String Excelpath = "src/test/resources/Exceldata/Pythoncode.xlsx";

	private String Code;
	public void openHomePage() {
		//driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dsportalapp.herokuapp.com/home");
	 }

	public void validateLogin() {
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("NinjaCoders");
		WebElement pword = driver.findElement(By.name("password"));
		pword.sendKeys("SDET135batch");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}
	public void navigate() {
		driver.navigate().back();
	}
	
	public void treePage() {
		driver.get("https://dsportalapp.herokuapp.com/tree/");
	}
	public void dropdown() {
    	driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']")).click();
    }
	
	public void listTree() {
    	List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
	    for (WebElement element : elements) {
	    if ("Tree".equals(element.getText())) {
			element.click();
			break;
		} else {
			continue;
		}
	  }
	}
	public void treeGetStarted()
	{
		driver.findElement(By.xpath("//a[@href='tree']")).click();
	}
    
	public void treePageAssert() {
		Assert.assertTrue(driver.findElements(By.xpath("//h4[text()='Tree']")).size()>0, "The user is on Tree page");
	}
		
	public void tryHere() {
		driver.findElement(By.xpath("//a[@href='/tryEditor']")).click();
	}
    
	public void overviewTreesClick() {
		driver.findElement(By.xpath("//a[text()='Overview of Trees']")).click();
	}
	public void terminologiesClick() {
		driver.findElement(By.xpath("//a[text()='Terminologies']")).click();
	}
	public void typesOfTreesClick() {
		driver.findElement(By.xpath("//a[text()='Types of Trees']")).click();
	}
	public void treeTraversalsClick() {
		driver.findElement(By.xpath("//a[text()='Tree Traversals']")).click();
	}
	public void traversalsIllustrationClick() {
		driver.findElement(By.xpath("//a[text()='Traversals-Illustration']")).click();
	}
	public void binaryTreesClick() {
		driver.findElement(By.xpath("//a[text()='Binary Trees']")).click();
	}
	public void typesOfBinaryTreesClick() {
		driver.findElement(By.xpath("//a[text()='Types of Binary Trees']")).click();
	}
	public void implementationInPythonClick() {
		driver.findElement(By.xpath("//a[text()='Implementation in Python']")).click();
	}
	public void binaryTreeTraversalsClick() {
		driver.findElement(By.xpath("//a[text()='Binary Tree Traversals']")).click();
	}
	public void implementationOfBinaryTreesClick() {
		driver.findElement(By.xpath("//a[text()='Implementation of Binary Trees']")).click();
	}
	
	public void applicationsOfBinaryTreesClick() {
		driver.findElement(By.xpath("//a[text()='Applications of Binary trees']")).click();
	}
	
	public void binarySearchTreesClick() {
		driver.findElement(By.xpath("//a[text()='Binary Search Trees']")).click();
	}
	public void implementationOfBstClick() {
		driver.findElement(By.xpath("//a[text()='Implementation Of BST']")).click();
	}
	public void practiceQuestionsClick() {
		driver.findElement(By.xpath("//a[text()='Practice Questions']")).click();
	}
	
	 public void pacticeQuesAssert()
	    {
		 String actualTitleTE = driver.getTitle(); // TODO: get actual title
	    	System.out.println("title:" +actualTitleTE);
	    String expectedTitleTE = "Practice Questions";
	    Assert.assertEquals(actualTitleTE, expectedTitleTE, "Condition true");
	    }
	 		 
	 public void onTryeditorpage() {
	    	String actualTitleTE = driver.getTitle(); // TODO: get actual title
	    	//System.out.println("title:" +actualTitleTE);
	    	String expectedTitleTE = "Assessment";
	    	Assert.assertEquals(actualTitleTE, expectedTitleTE, "Condition true");
	    }
	
	public void Readpythoncode(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		 ExcelReader reader = new ExcelReader();
		 try {
		 List<Map<String, String>> testdata = reader.getData(Excelpath,Sheetname);
		 Code = testdata.get(RowNumber).get("Code");
		 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(Code);
		 } catch(ElementNotInteractableException e) {
			 System.out.print("Element is not interactable is handled");
		 }
	 	    Thread.sleep(500);
	 }
	 
	public void validOp() {
		 WebElement e1 = driver.findElement(By.xpath("//*[@id='output']"));
	    	System.out.println(e1.getText());
	    }
	 
	 public void Readinvalidcode(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		 ExcelReader reader = new ExcelReader();
		 try {
    	 List<Map<String, String>> testdata1 = reader.getData(Excelpath,Sheetname);
		 Code = testdata1.get(RowNumber).get("Code");
		 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(Code);
		 } catch(ElementNotInteractableException e) {
			 System.out.print("Element is not interactable is handled");
		 }
	 	    Thread.sleep(500);
	   }
	 
	 public void runBtn() {
	     driver.findElement(By.xpath("//button[text()='Run']")).click();
	    }
	 
	 public void inValidOutputMessage() throws InterruptedException {
		
		    Alert alert = driver.switchTo().alert();
		    String alertMessage= driver.switchTo().alert().getText(); 
		    System.out.println(alertMessage); 
		    Thread.sleep(500);
		    alert.accept();

		    }
}