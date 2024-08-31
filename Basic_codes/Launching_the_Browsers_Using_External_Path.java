package Basic_codes;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Launching_the_Browsers_Using_External_Path {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chandra kumar M\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
				ChromeDriver A = new ChromeDriver();
				
				
				

		System.setProperty("webdriver.edge.driver","C:\\Users\\Chandra kumar M\\Documents\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			
						EdgeDriver B = new EdgeDriver();
						
				
				
				// Similar for the all kind of the Browsers.
	}

}
