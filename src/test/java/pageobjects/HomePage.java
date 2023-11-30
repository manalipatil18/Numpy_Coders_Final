package pageobjects;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import stepdefinition.Bclass;

public class HomePage extends Bclass{
	
	// static WebDriver driver ; 
	 private WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
	
	public void dsAlgo() {
	
	       // driver = new ChromeDriver();
		
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://dsportalapp.herokuapp.com/");
			
	}
	
	public void getStarted() {
		
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	
	}
	
	public void homePage() {
		
		Assert.assertTrue(driver.findElements(By.xpath("/html/body/div[1]/nav/a")).size()>0, "The user is redirected to homepage");
	
	}
	
	
	public void dropdown() {
		
		driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']")).click();
	}
	
	
	public void dsListArray() {
		

    	List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
    	
    	
    	for (WebElement element : elements) {
    	if ("Arrays".equals(element.getText())) {
    			element.click();
    			break;
    		} else {
    			continue;
    		}
		
	     }
	
    }
	
    public void dsListStack() {
		

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
	
  public void dsListLinkedList() {
    		

     List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
        	
        	
        	for (WebElement element : elements) {
        	if ("Linked List".equals(element.getText())) {
        			element.click();
        			break;
        		} else {
        			continue;
        		}
        	}
    		
    	     }
   public void dsListQueue() {
        		

        List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
            	
            	
             for (WebElement element : elements) {
            	if ("Queue".equals(element.getText())) {
            			element.click();
            			break;
            		} else {
            			continue;
            		}
            	}
        		
        	     }
        	
            	
   public void dsListTree() {
            		

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
            	
   public void dsListGraph() {
                		

       List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
                    	
                    	
           for (WebElement element : elements) {
              if ("Graph".equals(element.getText())) {
                   element.click();
                    	break;
                } else {
                   continue;
                 }
             }
                		
         }
                	
                    	
                    		
                    	     
    public void alertLog() {
		
		  System.err.println("=====" + driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText());
		  	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText(), "You are not logged in");
	
//	public WebDriver getDriverFromHP() {
//		return driver;
	}
	
	
}


