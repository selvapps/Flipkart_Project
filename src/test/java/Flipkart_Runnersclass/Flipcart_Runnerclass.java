package Flipkart_Runnersclass;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_Class.Flipkart_Base_Class;
import pom_Flipkart.First_Product;
import pom_Flipkart.Home_page;
import pom_Flipkart.addToCartPage;

public class Flipcart_Runnerclass extends Flipkart_Base_Class {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		driver=Browser_Launch("chrome");
		launchUrl("https://www.flipkart.com/");
		maximize();
		String title = getTitle();  
		System.out.println(title);
		if(title.contains(title)) {
			System.out.println("page to be verified");
		}else {
			driver.quit();
		}
		
		sleep();
		
		Home_page hm = new  Home_page(driver);
		clickOnElement(hm.getFindElement());
		sendKeys(hm.getSearchproduct(), "iphone");
		Wait();
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		//clickOnElement(hm.getSubmit());
		submit.click();
        Wait();
  		WebElement searchproduct1 = driver.findElement(By.xpath("//div[@class=\"_1AtVbE col-12-12\"]//descendant::div[@class=\"col col-7-12\"]//child::div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"));
     clickOnElement(searchproduct1);
  		Set<String> windowHandles = driver.getWindowHandles();

		for (String s : windowHandles) {
			String titles = driver.switchTo().window(s).getTitle();
			System.out.println(titles);
		}

		First_Product fp =new First_Product(driver);
    WebElement iphonePrice1 = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']"
    		+ "//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
Wait();


    System.out.println("iphone price1 "+fp.getIphonePrice1());
  	    String price1 = iphonePrice1.getText().replaceAll("[₹,]", "");
  	    int Firstiphoneprice = Integer.parseInt(price1);
  	    System.out.println("Firstiphoneprice : "+Firstiphoneprice);
  		Set<String>  parentwindow = driver.getWindowHandles();
  		for (String string : parentwindow) {
		driver.switchTo().window(string);
		}
        sleep();
  	
      //WebElement botton = driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2U9uOA _3v1-ww\']"));
  		clickOnElement(fp.getBotton());
     sleep();  		
  		
  		Set<String> windowHandles1 = driver.getWindowHandles();
  		for (String String1 : windowHandles1) {
  			String title2 = driver.switchTo().window(String1).getTitle();
  			if(title2.equals("Iphone- Buy Products Online at Best Price in India - All Categories | Flipkart.com")) {
  				break;
  			}
  		}
  		
  	
  		Thread.sleep(3000);
  		 //DIFFERENT PRICE OF PROUDCTS
        
  		WebElement Product2	 = driver.findElement(By.xpath("//div[@class=\"_2kHMtA\"]//descendant::div[@class=\"col col-7-12\"]//child::div[text()='APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']"));
  		
  	clickOnElement(Product2);
  		
		Set<String> iphone2 = driver.getWindowHandles();
		for (String s1 : iphone2) {
			String titles = driver.switchTo().window(s1).getTitle();
			System.out.println(titles);
		}
		
		
      
		WebElement iphone2Price = driver.findElement(By.xpath(
				"//div[@class='_1AtVbE col-12-12']//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
		System.out.println("Product2 iphone price:" + 	get_Text(iphone2Price));
	
		String price2 = 	get_Text(iphone2Price).replaceAll("[₹,]", "");
		int second_iphoneprice = Integer.parseInt(price2);
		System.out.println("Product2 iphone price: " + second_iphoneprice);

  			
			WebElement ipone2 = driver.findElement(By.xpath("//div[@style=\"background-color: rgb(255, 255, 255); padding: 16px;\"]//descendant::button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
			clickOnElement(ipone2);
    sleep();   

	
	//ADD TO TWO PRODUCT PRICE
	
         int TotalProductprice =Firstiphoneprice+second_iphoneprice;
		System.out.println("TotalProductprice : "+TotalProductprice);
	//TO SWITCH TO HOME WINDOW
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String String2 : windowHandles1) {
  			String title2 = driver.switchTo().window(String2).getTitle();
  			if(title2.equals("Iphone- Buy Products Online at Best Price in India - All Categories | Flipkart.com")) {
  				break;
  			}
  		}
  		
	//ADD TO CART IN tOTAL PRICE
		
		addToCartPage ap =new addToCartPage(driver);
	 
		//WebElement findElement2 = driver.findElement(By.xpath("//div[@class='YUhWwv']"));
		clickOnElement( ap.getFindElement2());
		
		//WebElement cartPrice = driver.findElement(By.xpath("(//div[@class='Ob17DV']//descendant::div[@class='_24KATy']//child::div[@class='_2npqm0']//following::span)[1]"));
      
		System.out.println("Total cart price :"+get_Text( ap.getCartPrice()));
         String TotalcartPrice=get_Text(ap.getCartPrice()).replaceAll("[₹,]", "");
         int totalcartPrice = Integer.parseInt(TotalcartPrice);
         System.out.println("Total cart price :"+totalcartPrice);
	
    // TO CHECK BOTH PRICE ARE EQUAL OR NOT
	if(TotalProductprice==totalcartPrice) {
		System.out.println("BOTH PRICE ARE SAME");
		quit();
	}else{
		System.out.println("BOTH PRICE ARE NOT SAME");
	}
	

	}
	
		
}	
		








