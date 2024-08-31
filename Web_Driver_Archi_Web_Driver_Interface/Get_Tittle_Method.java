package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Tittle_Method {
	
	
	public static void main(String[] args) {
		
		
		 ChromeDriver A = new ChromeDriver();
   	  
   	   A.get("https://www.fireflink.com/");
   	  
		// Once We launch and Navigate to the specific URL then only we can get the title of the web page in the String Format
   	   
   	   
   	   // We can see the title in the corner of the web page
   	   
   	   
   	   // Then we can also print the title-----> We can see it in the console
   	   
   	   
   	  String E =  A.getTitle();
   	  
   	  
   	  System.out.println(E);
   	  
   	 System.out.println(A.getTitle());
   	 
   	 
	}

}
