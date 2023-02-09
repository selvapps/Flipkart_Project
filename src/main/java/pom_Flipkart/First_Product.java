package pom_Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Product {
	
	 public static WebDriver driver;
	// WebElement iphonePrice1 = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']"
	    //		+ "//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
	
	
// WebElement botton = driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2U9uOA _3v1-ww\']"));
	
	@FindBy(xpath="//div[@class=\\\"_1AtVbE col-12-12\\\"]//descendant::div[@class=\\\"col col-7-12\\\"]//child::div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")
	  private  WebElement  searchproduct1;
	
 public First_Product(WebDriver driver2) {
 this.driver=driver2;
 PageFactory.initElements(driver, this);
 
 }

public WebElement getSearchproduct1() {
		return searchproduct1;
	}

	public WebElement getIphonePrice1() {
		return iphonePrice1;
	}

	public WebElement getBotton() {
		return botton;
	}

@FindBy(xpath="//div[@class='_1AtVbE col-12-12']\"\r\n"
 		+ "	    		+ \"//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']")
private  WebElement  iphonePrice1;

@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement botton;
}
