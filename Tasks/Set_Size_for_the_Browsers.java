package Tasks;

import org.openqa.selenium.Dimension;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Set_Size_for_the_Browsers {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver Y = new FirefoxDriver();
		
		Y.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		Y.get("https://demowebshop.tricentis.com/register");
		
		Thread.sleep(3000);
		
		
	//	In all (Width, Height)
		
		
		
		// Dimension E = new Dimension(800,800);
		
		// Y.manage().window().setSize(E);   // Give the same Height and the same width
		
		
	//	System.out.println(Y.manage().window().getSize());
		
		
		
		
		
	  //  Dimension F = new Dimension(-424,700);  // If it is even one negative it will not accepts (Invalid Argument Exception)
		
	 //	Y.manage().window().setSize(F);
		
	//	System.out.println(Y.manage().window().getSize());
		
		
		
		
		
	//  Dimension G = new Dimension(-600,-800);    // If it is even one negative it will not accepts (Invalid Argument Exception)
		
	//	Y.manage().window().setSize(G);
		
	//	System.out.println(Y.manage().window().getSize());
		
		
		
		
		
    //		Dimension H = new Dimension(0,-800);       // If it is even one negative it will not accepts (Invalid Argument Exception)
		
   //		Y.manage().window().setSize(H);
			
	//	System.out.println(Y.manage().window().getSize());
		
		
		
		
			
			
		
   //  Dimension I = new Dimension(0,400);    // It will set based on the values here
			
	//	Y.manage().window().setSize(I);
		
	//	System.out.println(Y.manage().window().getSize());  // Here width will be 456 and height  will be 400
		
		
		
		
		
			
			
	   Dimension J= new Dimension(0,0);     //The title and the search things in the page are only visible
				
	   Y.manage().window().setSize(J);
		
		
		System.out.println(Y.manage().window().getSize().getHeight());
		
		
		 
		
		System.out.println(Y.manage().window().getSize().getWidth());
				
		System.out.println(Y.manage().window().getSize());   // Here width (0) will be 456 and the Height (0) will be 124
	
	}

}
