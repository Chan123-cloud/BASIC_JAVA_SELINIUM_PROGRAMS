package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Element_Using_PAR_LT {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Y = new ChromeDriver();
		
		Y.manage().window().maximize();
		
		Y.get("https://www.kalkifashion.com/in/");
		
	   Thread.sleep(10000);
	   
	   System.out.println(Y.getTitle());
	   
	   
	   
	   
	   
	   
	   
	   Y.findElement(By.xpath("//button[text()='No thanks']")).click();
	   
	   
	   // This is the way to give the text in the x path
	   
	   
	   
	   // we cant give the text in the CSS selectors
	   
	   
	   
	   Thread.sleep(10000);
	   
	  
       System.out.println(Y.getTitle());
       
       
       
       // Here We are hanlding the small pop page....If we not handle it we cant allow do the further operation.
       
       
       // So when there is an pop page display so first handle it and then perform tha actual action.
	   
	    
	    
	   Y.findElement(By.partialLinkText("CO-ORD SETS")).click();
	   
	   Thread.sleep(10000);
	   
	   
	   System.out.println(Y.getTitle());
	   
	   
		
	}

}
