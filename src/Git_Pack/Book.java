package Git_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Book {

	public static void main(String[] args) throws InterruptedException {
		
		        WebDriver driver=new ChromeDriver();
				
			    driver.get("https://demo.nopcommerce.com/");
			     
			    driver.manage().window().maximize();
			     driver.navigate().back();
		            driver.navigate().forward();
			    
//				1. Register    
			     
			    driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
			     
			    driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
			    
			    driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("safiya sharma");
			    
			    driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("safi");
			    
			    driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")).sendKeys("31");
			    
			    driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")).sendKeys("may");
			    
			    driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")).sendKeys("2002");
			    
			    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("safiayashaik@gmail.com");
			    
			    driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("charani techsoft Pvt Ltd");
			    
			    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();   
			    
			    driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Shaik@2002");
			    
			    driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Shaik@2002");
			    
			    driver.findElement(By.xpath("//button[@id=\"register-button\"]")).click();
			    
			    driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]")).click();
			    
			 // 2. Login
			    
			    driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("safiayashaik@gmail.com");
			 
			    driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys("Shaik@2002");
			    
			    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click() ;  
			    
			    driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
			    
				
			    //books
			   
			    driver.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).click();
			    
			    //drop down
			    
		          WebElement drop=  driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));    // drop down  for position
			    
			    Select as= new Select(drop);
			    
			    as.selectByValue("5");
			    
			    Thread.sleep(2000);
			    
			    as.selectByValue("10");
			    
			    WebElement task=   driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));   // drop down for display
			    
			    Select sa=new Select(task);
			    
			     sa .selectByValue("6");
			    
			    Thread.sleep(2000);
			    
			    sa.selectByValue("9");
			    
			    Thread.sleep(2000);
			    
			    //pride
			    
			    
			    driver.findElement(By.xpath("(//a[@href=\"/pride-and-prejudice\"])[4]")).click();                 //insp
			    
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-39\"]")).click();                 // add cart
			    
			    Thread.sleep(2000);

			    driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-39\"]")).click();             //whistlist
			    
			   //by ray
			    
			    
			    driver.findElement(By.xpath("(//a[@href=\"/fahrenheit-451-by-ray-bradbury\"])[4]")).click();        // insp
			    
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-37\"]")).click();                   //add cart
			    
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-37\"]")).click();               //whistlist
			    
			    //first pize
			    
			    
			    
			    driver.findElement(By.xpath("(//a[@href=\"/first-prize-pies\"])[2]")).click();                    // insp
			    
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-38\"]")).click();                  // add cart
			    
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-38\"]")).click();              // whistlist
			}
	

}

