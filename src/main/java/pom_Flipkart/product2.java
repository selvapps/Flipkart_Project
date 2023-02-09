package pom_Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product2 {
	public static WebDriver driver;
		//WebElement Product2	 = driver.findElement(By.xpath("//div[@class=\"_2kHMtA\"]//descendant::div[@class=\"col col-7-12\"]//child::div[text()='APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']"));

	//	WebElement iphone2Price = driver.findElement(By.xpath(
			//	"//div[@class='_1AtVbE col-12-12']//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
	//	WebElement ipone2 = driver.findElement(By.xpath("//div[@style=\"background-color: rgb(255, 255, 255); padding: 16px;\"]//descendant::button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));

	
		
		@FindBy(xpath="(//div[@class=\\\"_2kHMtA\\\"]//descendant::div[@class=\\\"col col-7-12\\\"]//child::div[text()='APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']\")")
		private WebElement Product2;
		

		public product2(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver,this);
			
		}

		public WebElement getProduct2() {
			return Product2;
		}

		public WebElement getIphone2Price() {
			return iphone2Price;
		}

		public WebElement getIpone2() {
			return ipone2;
		}

		@FindBy(xpath="\"//div[@class='_1AtVbE col-12-12']//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']\")")
		private WebElement iphone2Price;
		
		@FindBy(xpath="//div[@style=\\\"background-color: rgb(255, 255, 255); padding: 16px;\\\"]//descendant::button[@class=\\\"_2KpZ6l _2U9uOA _3v1-ww\\\"]\")")
		private WebElement ipone2;
		
		
		

		
}
