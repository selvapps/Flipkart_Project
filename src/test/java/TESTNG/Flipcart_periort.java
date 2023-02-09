package TESTNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Flipcart_periort {
   
	
	WebDriver driver;
//	String TotalProductprice=null;
//	String TotalProductprice=null;
	 int Firstiphoneprice;
		int second_iphoneprice;
		int TotalProductprice;
		int totalcartPrice;
		String title;
		public static  String check;
	private static ChromeOptions desiredOptions() {
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("start-maximized");
	    return options;

	  }
	@BeforeSuite
	    private void Broeser_Launch() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(desiredOptions());
		}
	
	@BeforeTest
	  private void Browser_Launch() {
		  driver.get("https://www.flipkart.com/");
			check ="Flipkart";
	}
	
	  @BeforeClass
	  private void Toverify_curentPage() throws InterruptedException {
		  Thread.sleep(3000);
		  title = driver.getTitle();
			System.out.println("To get tittle : "+title);
			if(title.contains(title)) {
				System.out.println("page to be verified");
			}else {
				driver.quit();
			}                      
	}
	     @Test(priority = 1)
	        private void Search_Product() throws InterruptedException {
	        	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    		
	    		WebElement searchproduct = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    		searchproduct.sendKeys("iphone");
	            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	          Thread.sleep(1000);
			}
	
	     @Test(priority = 2)
	        private void First_Product() throws InterruptedException {
//	        	driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']//child::a[@class="
//	            		+ "'_1fQZEK']//descendant::div[@class='_3pLy-c row']//descendant::div[@class="
//	            		+ "'col col-7-12']"
//	            	+ "//child::div[text()='APPLE iPhone 12 mini (Black, 64 GB)']")).click();
	    	// Thread.sleep(4000);
	    	 WebElement searchproduct1 = driver.findElement(By.xpath("//div[@class=\"_1AtVbE col-12-12\"]//descendant::div[@class=\"col col-7-12\"]//child::div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"));
	      		searchproduct1.click();
	      		Thread.sleep(2000);
	    		Set<String> windowHandles = driver.getWindowHandles();

	    		for (String s : windowHandles) {
	    			String titles = driver.switchTo().window(s).getTitle();
	    			System.out.println(titles);
	    		}

			}
	
	     @Test(priority = 3)
	     private void First_productprice() throws InterruptedException {
	    	 WebElement iphonePrice1 = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']"
	    	    		+ "//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
	    	  		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	  		System.out.println("iphone price1 "+iphonePrice1.getText());
	    	  	    String price1 = iphonePrice1.getText().replaceAll("[₹,]", "");
	    	  	    Firstiphoneprice = Integer.parseInt(price1);
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
		}
	
	
	     @Test(priority = 4 )
	  private void Second_proudcuct() throws InterruptedException {
		  
	  		WebElement Product2	 = driver.findElement(By.xpath("//div[@class=\"_2kHMtA\"]//descendant::div[@class=\"col col-7-12\"]//child::div[text()='APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']"));
	  		
	  		Product2.click();
	  		Thread.sleep(3000);
			Set<String> iphone2 = driver.getWindowHandles();
			for (String s1 : iphone2) {
				String titles = driver.switchTo().window(s1).getTitle();
				System.out.println(titles);
			}
			
	}
	
	     @Test(priority = 5)
	  private void Second_proudcuctprice() throws InterruptedException {
		  WebElement iphone2Price = driver.findElement(By.xpath(
					"//div[@class='_1AtVbE col-12-12']//child::div[@class='aMaAEs']//descendant::div[@class='_3I9_wc _2p6lqe']"));
			System.out.println("Product2 iphone price:" + iphone2Price.getText());
			String price2 = iphone2Price.getText().replaceAll("[₹,]", "");
			 second_iphoneprice = Integer.parseInt(price2);
			System.out.println("Product2 iphone price: " + second_iphoneprice);

	  			
				driver.findElement(By.xpath("//div[@style=\"background-color: rgb(255, 255, 255); padding: 16px;\"]//descendant::button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
	   
	   
	}
	
	
	
	@Test(priority = 6)
	private void Add_TO_TwoProduct_price() throws InterruptedException {
		//Thread.sleep(4000);
		 TotalProductprice =Firstiphoneprice+second_iphoneprice;
			System.out.println(TotalProductprice  +TotalProductprice);
			
		
	}
	@Test(priority = 7)
	  private void switch_toparentwindow() throws InterruptedException {

		Set<String> windowHandles3 = driver.getWindowHandles();
		for (String String2 : windowHandles3) {
  			String title2 = driver.switchTo().window(String2).getTitle();
  			System.out.println(title2);
  			if(title2.equals(title)) {
  				break;
  			}
  			Thread.sleep(3000);
  		}
	
	}

	
		
	@Test(priority = 8)
	private void Add_TocartIn_TwoPrice() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='YUhWwv']")).click();
		WebElement cartPrice = driver.findElement(By.xpath("(//div[@class='Ob17DV']//descendant::div[@class='_24KATy']//child::div[@class='_2npqm0']//following::span)[1]"));
         System.out.println("Total cart price :"+cartPrice.getText());
         String TotalcartPrice= cartPrice.getText().replaceAll("[₹,]", "");
         int totalcartPrice = Integer.parseInt(TotalcartPrice);
         System.out.println("Total cart price :"+totalcartPrice);
		
		if(TotalProductprice==totalcartPrice) {
			System.out.println("BOTH PRICE ARE SAME");
		}else{
			System.out.println("BOTH PRICE ARE NOT SAME");
		}
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
