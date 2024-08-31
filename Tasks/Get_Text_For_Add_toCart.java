package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Get_Text_For_Add_toCart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver D = new EdgeDriver();
		
		D.manage().window().maximize();
		
		D.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(10000);
		
	  D.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@class='button-2 product-box-add-to-cart-button']")).click();
	  
	 WebElement TEXT = D.findElement(By.xpath("//span[@title='Close']"));
		
    System.out.println(TEXT);
    
  //  System.out.println(S);
	  
	}

}
