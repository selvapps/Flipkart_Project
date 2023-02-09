package pom_Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCartPage {
	//WebElement findElement2 = driver.findElement(By.xpath("//div[@class='YUhWwv']"));
//	WebElement cartPrice = driver.findElement(By.xpath("(//div[@class='Ob17DV']//descendant::div[@class='_24KATy']//child::div[@class='_2npqm0']//following::span)[1]"));
 public static WebDriver driver;
	@FindBy(xpath="//div[@class='YUhWwv']")
	private WebElement  findElement2;
	
	public addToCartPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFindElement2() {
		return findElement2;
	}

	public WebElement getCartPrice() {
		return cartPrice;
	}

	@FindBy(xpath=(" (//div[@class='Ob17DV']//descendant::div[@class='_24KATy']//child::div[@class='_2npqm0']//following::span)[1]\")"))
	private WebElement  cartPrice;
}
