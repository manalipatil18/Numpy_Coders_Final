package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import stepdefinition.Bclass;

public class HomePageCards extends Bclass{
	
	//static WebDriver driver   ; 

	private WebDriver driver;
	public HomePageCards(WebDriver driver) {
		this.driver = driver;
	}
	
	public void homePg() {
		
		// driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dsportalapp.herokuapp.com/home");

}
	
	public void numpyNinja() {
		driver.navigate().refresh();  
	}
     
    public void alertAssert() {
    	System.err.println("=====" + driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText());
    	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText(), "You are not logged in");
    }

	public void dsinduction()
	{
		
		driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();
		
	}
	
	public void linkList() {
	
		driver.findElement(By.xpath("//a[@href='linked-list']")).click();
		
	}
	
	public void stack() {
		
		driver.findElement(By.xpath("//a[@href='stack']")).click();
		
	}
	
	public void array() {
		
		driver.findElement(By.xpath("//a[@href='array']")).click();
		
	}
	
	public void queue() {
		
		driver.findElement(By.xpath("//a[@href='queue']")).click();
		
	}
	
	public void tree() {
		
		driver.findElement(By.xpath("//a[@href='tree']")).click();
	}
	
	public void graph() {
		
		driver.findElement(By.xpath("//a[@href='graph']")).click();
		
		
	}
	
}