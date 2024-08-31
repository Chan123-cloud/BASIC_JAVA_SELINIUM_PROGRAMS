package Web_Element_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		EdgeDriver W = new EdgeDriver();
		
		
		W.manage().window().maximize();
		
		
		W.get("https://demowebshop.tricentis.com/login");
		
		
		Thread.sleep(25000);
		
		
		WebElement Email_TF = W.findElement(By.xpath("//input[@id='Email']"));
		
		
	    Email_TF.click();
		
		Email_TF.sendKeys("mchandrakumarms@gmail.com");
		
		
		Thread.sleep(4000);
		
		
		
		// Which is used to remove the data from the Text Field
		
		
		Email_TF.clear();
		
		Thread.sleep(4000);

		
		
		Email_TF.sendKeys("mchandrakumarms@gmail.com");
		
		Thread.sleep(4000);

		
		W.close();

	
		
		
		
		
		
		
		
		
	}

}
