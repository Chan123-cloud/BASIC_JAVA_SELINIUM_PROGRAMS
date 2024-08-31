package Tasks;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method_With_Diff_URLS {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver B = new ChromeDriver();
		 
		 B.get("https://www.shoppersstack.com/");
		 
		 
		 Thread.sleep(10000);
		 
		 B.get("https://www.fireflink.com/");
		 
		 
		 Thread.sleep(10000);
		 
		 // If we are Navigating to the different applications also means  In a single tab the operation is performing 
		 
		 
		 //as well as the forward and backward things are also happening.
		 
		 
		 B.navigate().back();
		 
		 
		 Thread.sleep(10000);
		 
		 
		 
		 
		 
		 B.navigate().refresh();
		 
		 
		 Thread.sleep(10000);
		 
		 
		 
		 
		 B.navigate().forward();
		 
		 
		 Thread.sleep(10000);
		 
		 
		 
		 
        B.navigate().refresh();
		 
		 
		 Thread.sleep(10000);
		 
		 
		 
		 B.close();
		 
		
	}

}
