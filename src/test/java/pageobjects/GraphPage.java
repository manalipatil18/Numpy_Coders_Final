package pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import stepdefinition.Bclass;
import utilities.ExcelReader;

//import Utilities.ExcelReader;
//import Utilities.Helper;


public class GraphPage extends Bclass {
	
	By dropdown = By.xpath("//a[@class ='nav-link dropdown-toggle']");
	By graphLink = By.cssSelector("body > div:nth-child(2) > ul:nth-child(8) > a:nth-child(1)");
	By textarea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By graphRep = By.xpath("//a[text()='Graph Representations']");
	
	private WebDriver chromedriver;
	private String Excelpath = "src/test/resources/Exceldata/Pythoncode.xlsx";
	private String Code;
	private int RowNumber;
	private By TextArea;
	private String Sheetname;
	
	public GraphPage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}
	
public void dropdown() {
		
	chromedriver.findElement(dropdown).click();
	
	}
	
public void dsListGraph() {
	
  List<WebElement> elements = chromedriver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
                 	
               for (WebElement element : elements) {
           if ("Graph".equals(element.getText())) {
                element.click();
                 	break;
             } else {
                continue;
              }
          }
}

  public void graphPageConf() {
	
	String actualTitle = chromedriver.getTitle();
	String expectedTitle = "Graph";
	Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
  
  }

  public void graphLinkClick() {
	  
	  chromedriver.findElement(graphLink).click();
 }
  
 public void ReadData(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException{
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, Sheetname);
		Code = testdata.get(RowNumber).get("Code");
		chromedriver.findElement(textarea).sendKeys(Code);
		Thread.sleep(500);

 }
 
 public void enterGraphStringInvalidMsg() throws InterruptedException {
	  
	  Alert alert = chromedriver.switchTo().alert();
		String alertMessage= chromedriver.switchTo().alert().getText(); 
		System.out.println(alertMessage); 
		Thread.sleep(500);
		alert.accept();
	  }
 
 public void ReadDataValid() throws InterruptedException, InvalidFormatException, IOException {
	 
	 ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata1 = reader.getData(Excelpath, Sheetname);
		Code = testdata1.get(RowNumber).get("Code");
		chromedriver.findElement(TextArea).sendKeys(Code);
		Thread.sleep(500);
	 }
 
 public void graphRepLink() {
	 
	 chromedriver.findElement(graphRep).click();
 }
 
  public void graphRepConf() {
	
	String actualTitle = chromedriver.getTitle();
	String expectedTitle = "Graph Representations";
	Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
  }


	
 
}
