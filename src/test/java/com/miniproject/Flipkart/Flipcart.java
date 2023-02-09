package com.miniproject.Flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Selenium_MiniProject\\driver\\chromedriver.exe");
		WebDriver  driver =new ChromeDriver();  
		driver.get("https://www.flipkart.com/");
		String check ="Flipkart";
		driver.manage().window().maximize();
	   Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("To get tittle : "+title);
		if(title.contains(title)) {
			System.out.println("page to be verified");
		}else {
			driver.quit();
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement searchproduct = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchproduct.sendKeys("iphone");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
      Thread.sleep(1000);
      //TO SEARCH 1ST PRODUCT AND ADD TO CART
//        driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']//child::a[@class="
//        		+ "'_1fQZEK']//descendant::div[@class='_3pLy-c row']//descendant::div[@class="
//        		+ "'col col-7-12']"
//        		+ "//child::div[text()='APPLE iPhone 12 mini (Black, 64 GB)']")).click();
  		WebElement searchproduct1 = driver.findElement(By.xpath("//div[@class=\"_1AtVbE col-12-12\"]//descendant::div[@class=\"col col-7-12\"]//child::div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"));
  		searchproduct1.click();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String s : windowHandles) {
			String titles = driver.switchTo().window(s).getTitle();
			System.out.println(titles);
		}

	
    WebElement iphonePrice1 = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']"
    		+ "//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
  		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  		System.out.println("iphone price1 "+iphonePrice1.getText());
  	    String price1 = iphonePrice1.getText().replaceAll("[₹,]", "");
  	    int Firstiphoneprice = Integer.parseInt(price1);
  	    System.out.println("Firstiphoneprice : "+Firstiphoneprice);
  		Set<String>  parentwindow = driver.getWindowHandles();
  		for (String string : parentwindow) {
		driver.switchTo().window(string);
		}
      
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2U9uOA _3v1-ww\']")).click();
  		Thread.sleep(3000);
  		
  		
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
  		
  		Product2.click();
  		
		Set<String> iphone2 = driver.getWindowHandles();
		for (String s1 : iphone2) {
			String titles = driver.switchTo().window(s1).getTitle();
			System.out.println(titles);
		}
		
		
      
		WebElement iphone2Price = driver.findElement(By.xpath(
				"//div[@class='_1AtVbE col-12-12']//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
		System.out.println("Product2 iphone price:" + iphone2Price.getText());
		String price2 = iphone2Price.getText().replaceAll("[₹,]", "");
		int second_iphoneprice = Integer.parseInt(price2);
		System.out.println("Product2 iphone price: " + second_iphoneprice);

  			
			driver.findElement(By.xpath("//div[@style=\"background-color: rgb(255, 255, 255); padding: 16px;\"]//descendant::button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
   Thread.sleep(2000);
   
   
//   //SAME PRODUCT OF PRICE PRICE
//   
//   
//   WebElement iphone1 = driver.findElement(By.xpath(
//			"//div[@class='_1AtVbE col-12-12']//child::a[@class='_1fQZEK']//descendant::div[@class='_3pLy-c row']//descendant::div[@class='col col-7-12']//div[text()=\"APPLE iPhone 12 mini (Black, 64 GB)\"]"));
//	iphone1.click();
//
//	Set<String> windowHandles11 = driver.getWindowHandles();
//
//	for (String s : windowHandles11) {
//		String titles = driver.switchTo().window(s).getTitle();
//		System.out.println(titles);
//	}
//	WebElement iphone1Price = driver.findElement(By.xpath(
//			"//div[@class='_1AtVbE col-12-12']//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
//	System.out.println("Product1 iphone price:" + iphone1Price.getText());
//	String price11 = iphone1Price.getText().replaceAll("[₹,]", "");
//	int second_iphoneprice = Integer.parseInt(price11);
//	System.out.println("Product1 iphone price: " + second_iphoneprice);
//	WebElement addtocart1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//	addtocart1.click();
	
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
		driver.findElement(By.xpath("//div[@class='YUhWwv']")).click();
		WebElement cartPrice = driver.findElement(By.xpath("(//div[@class='Ob17DV']//descendant::div[@class='_24KATy']//child::div[@class='_2npqm0']//following::span)[1]"));
         System.out.println("Total cart price :"+cartPrice.getText());
         String TotalcartPrice= cartPrice.getText().replaceAll("[₹,]", "");
         int totalcartPrice = Integer.parseInt(TotalcartPrice);
         System.out.println("Total cart price :"+totalcartPrice);
	
    // TO CHECK BOTH PRICE ARE EQUAL OR NOT
	if(TotalProductprice==totalcartPrice) {
		System.out.println("BOTH PRICE ARE SAME");
	}else{
		System.out.println("BOTH PRICE ARE NOT SAME");
	}
	
	driver.close();
	}
	
	
		
}	
		
		
		
		
	
