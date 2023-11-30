package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

import stepdefinition.Bclass;
import utilities.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage extends Bclass{
	
 //static WebDriver driver;
	
	By registerBtn = By.xpath("//a[@href ='/register']");
	By usname = By.id("id_username");
	By psword = By.name("password1");
	By confpsword = By.name("password2");
	By register = By.xpath("//input[@value='Register']");
	By errormsg = By.xpath("//div[@class='alert alert-primary']");
	By successmsg = By.xpath("//div[@class='alert alert-primary']");
	By errormsg1 = By.xpath("//div[@class='alert alert-primary']");
	
	private WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void registerPage() {
		
		//driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
 }
   
   public void registerClick() {
	   
	   driver.findElement(registerBtn).click();
	   System.out.println("i am inside reg. page");
   }
   
   public void sendUserName(String username) {
	   
	   driver.findElement(usname).sendKeys(username);
   }
   
   public void sendPassword(String password) { 
	   
	   driver.findElement(psword).sendKeys(password);
   }
   public void sendConfirmation(String confirmpassword) {
	
	   driver.findElement(confpsword).sendKeys(confirmpassword);
   }
	   
   
   
 
   
  // public void sendUserName(String username) {
	   
//	   chromedriver.findElement(usname).sendKeys(username);
//	   } 
   
  //public void sendPassword(String password) {
	   
	//  chromedriver.findElement(psword).sendKeys(password);
	  // } 

  //public void sendConfirmation(String confirmpassword) {
	   
	//	chromedriver.findElement(confpsword).sendKeys(confirmpassword);
	  // } 
  

  public void register() {
	   
	  driver.findElement(register).click();
	   
  } 
  
  
  
   public void pwdmissMatch() {
	   
	   WebElement Errmsg =  driver.findElement(errormsg);
		String text=(Errmsg).getText();
		System.out.println(text);
     
   
   }
   
   public void successMsg() {
	   
   WebElement succmsg =  driver.findElement(successmsg);
	  String text1=(succmsg).getText();
	  System.out.println(text1);
   }
   
   public void Reregister() {
	   WebElement Errmsg1 =  driver.findElement(errormsg1);
		String text1=(Errmsg1).getText();
		System.out.println(text1);
		String expectedElementText1 = "User is already registered";
		Assert.assertEquals(text1, expectedElementText1,"Expected and Actual are not same");
//		try {
//		    Assert.assertNotEquals(text1, expectedElementText1);
//		} catch (Exception e) {
//		    // Thread the excpetion here
//		}
	
   }

}







