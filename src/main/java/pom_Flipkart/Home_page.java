package pom_Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public static WebDriver driver;
	//WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

	//WebElement searchproduct = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));

  //  WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	//	WebElement searchproduct1 = driver.findElement(By.xpath("//div[@class=\"_1AtVbE col-12-12\"]//descendant::div[@class=\"col col-7-12\"]//child::div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"));


  @FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
  private  WebElement  findElement;
	
 
public Home_page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getFindElement() {
	return findElement;
}

public WebElement getSearchproduct() {
	return searchproduct;
}

public WebElement getSubmit() {
	return submit;
}

@FindBy(xpath="//input[@title='Search for products, brands and more']")
  private  WebElement  searchproduct;
		
  @FindBy(xpath="//button[@type=\\\"submit\\\"]")
  private  WebElement  submit;
		
 
		
		
		
		
}
