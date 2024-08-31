package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class window_2 {
	
	  
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver E = new ChromeDriver();
	
	Thread.sleep(3000);
	
		
	
	  E.get("https://www.fireflink.com/");
	
	  
	  Thread.sleep(3000);
	  
	  
		
	 Point S = E.manage().window().getPosition();   // to get both X and Y values
	
	
	  System.out.println(S);
	  
	  
	  Thread.sleep(3000);
		
	  
	  
	  
	  int a =  E.manage().window().getPosition().getX();  // To get X value position Individually
	  
	  
	  System.out.println(a);
	  
	  
	  int b =  E.manage().window().getPosition().getY() ;   // To get Y value position Individually
	  
	  System.out.println(b);
	  
	  
	  Thread.sleep(3000);
		
	  
	  
	  
	  // To set the position of the Browser
	  
	  
	    Point D = new Point (4,6);
	  
	   E.manage().window().setPosition(D);  // setting the position  X and Y  
	   
	   Thread.sleep(3000);
		
	   
	   
	   
	  Point Y =  E.manage().window().getPosition(); // After Setting the Position we are getting the Position
			  
			  
	  
	  System.out.println(Y);
	  
	  
      Thread.sleep(3000);
		
		
		E.close();
		
		
	}

}
