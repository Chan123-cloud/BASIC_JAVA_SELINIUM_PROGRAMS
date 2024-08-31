package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver A = new ChromeDriver();
		
		
		
		
		A.get("https://www.shoppersstop.com/?utm_source=google&utm_medium=cpc&utm_campaign=SHOP_13245_adyogi_Brand_Search_Engage_Desktop_Exact-20307001336&gad_source=1&gclid=Cj0KCQjwiOy1BhDCARIsADGvQnCYkjBQRuzmr4Y22ojjIZXiizCEer4AM_E1A_djpy2gtp-Sht0mrhEaAvimEALw_wcB");
		
		Thread.sleep(5000);
		

		
		
		
		
		
		A.get("https://www.shoppersstop.com/account/storesandevents");
		
		
		Thread.sleep(5000);
		
	
		
		
		// Operation for the backward
		
		A.navigate().back(); //----> I am navigating from the second page to first page
		
		System.out.println(A.getTitle());
		
		Thread.sleep(5000);
		
	
		
		
		
		// Now I am in the first page
		
		
		
		// Operation for the forward
		
		
		A.navigate().forward(); // ----> I am navigating from the first page to second page
		
		System.out.println(A.getTitle());
		
		Thread.sleep(5000);
		
		
		
		// Now I am in the Second page
		
		
		 // Operation for the refresh
		
		
		
		A.navigate().refresh();  // ---> I will refresh the Second Page
		
        System.out.println(A.getTitle());
		
		Thread.sleep(5000);
		
		
		
		
		
		
		// When we accesses more links in the same browser it will not open the new tab 
		
		
		// In the same tab it will perform the all operations.
		
		
		
		
		A.navigate().to("https://www.shoppersstack.com/");  // --->It is to method
		
		
		Thread.sleep(5000);
		
		
		A.get( "https://www.fireflink.com/")  ; //It is get method
		
		
		// To method will not wait until the page  is loaded.  --> Other action will get started Quickly
		
		
		// Get method will wait until the page gets loaded ----> Other action will perform Normally
		
		
		
		Thread.sleep(5000);
		
		
		
		A.close(); // ---> Close the Main window
		
		
		
		
		
		
		
		
	}

}
