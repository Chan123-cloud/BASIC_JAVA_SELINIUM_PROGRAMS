package Tasks;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Google_Operations {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver S = new EdgeDriver();
		
		S.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		
		System.out.println(S.getTitle());
		
		Thread.sleep(3000);
		
		
		
		System.out.println();
		
		
		
		
		System.out.println(S.getPageSource());
		
		
		Thread.sleep(3000);
		
		
		S.close();
		
		
		
		
	}

}
