package pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import stepdefinition.Bclass;

public class Stack extends Bclass {
	// static WebDriver driver ; 
	 private WebDriver driver;
		public Stack(WebDriver driver) {
			this.driver = driver;
		}


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

	public void stackStartBtn() {
		driver.findElement(By.xpath("//a[@href='stack']")).click();
	}
	
	
    public void dropdown() {
    	driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']")).click();
    }
    
    public void listStack() {
    	List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
	    for (WebElement element : elements) {
	    if ("Stack".equals(element.getText())) {
			element.click();
			break;
		} else {
			continue;
		}
	
     }
}

    public void onStackPage() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Stack";
		Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
	}
	
	public void onStackPageAssert() {
		Assert.assertTrue(driver.findElements(By.xpath("//h4[text()='Stack']")).size()>0, "The user is on Stack page");
	}
	

	public void operationStack() {
		driver.findElement(By.xpath("//a[text()='Operations in Stack']")).click();
	}

	public void navigate() {
		driver.navigate().back();
	}

	public void tryHere() {
		driver.findElement(By.xpath("//a[text()='Try here>>>']")).click();
	}

	public void onTryeditorpage() {
    	String actualTitleTE = driver.getTitle(); // TODO: get actual title
    	//System.out.println("title:" +actualTitleTE);
    	String expectedTitleTE = "Assessment";
    	Assert.assertEquals(actualTitleTE, expectedTitleTE, "Condition true");
    }
	
	 public void enterInvalidCode(DataTable table) throws InterruptedException {
	    List<String> codedata = table.asList();
	   	String Coded = codedata.get(0);
        driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(Coded);
	 	Thread.sleep(500);

	    }  	 
	 		 
	 public void inValidOutputMessage() throws InterruptedException {
	    Alert alert = driver.switchTo().alert();
	    String alertMessage= driver.switchTo().alert().getText(); 
	    System.out.println(alertMessage); 
	    Thread.sleep(500);
	    alert.accept();

	    }
	 		
	 public void enterpythonCode(DataTable table1) throws InterruptedException {
	     List<String> codedata1 = table1.asList();
	   	 String Code1 = codedata1.get(0);
	     driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(Code1);
	 	 Thread.sleep(500);
        }     
	 
	 public void runBtn() throws InterruptedException {
	     driver.findElement(By.xpath("//*[@id='answer_form']/button")).click();
	   //  Thread.sleep(2000);
	    }
	    
	 public void validOutput() {
	     WebElement e = driver.findElement(By.xpath("//*[@id='output']"));
	     System.out.println(e.getText());
	    }
	    
	 public void implementation() {
	    driver.findElement(By.xpath("//a[text()='Implementation']")).click();
	    }
	    
	 public void application() {
	   driver.findElement(By.xpath("//a[text()='Applications']")).click();
	    }
	    
	 public void practiceQuestions()
	    {
	    driver.findElement(By.xpath("//a[text()='Practice Questions']")).click();
	    }
	    
	 public void pacticeQuesAssert()
	    {
		 String actualTitleTE = driver.getTitle(); // TODO: get actual title
	    	//System.out.println("title:" +actualTitleTE);
	    String expectedTitleTE = "Practice Questions";
	    Assert.assertEquals(actualTitleTE, expectedTitleTE, "Condition true");
	    }
	 		 
}
