package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

 public class Get_Text_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		
       WebDriver Q = new ChromeDriver();
		
		
		Q.manage().window().maximize();
		
		
		Q.get("https://demowebshop.tricentis.com/register");
		
		
		Thread.sleep(15000);
		
		
		Q.findElement(By.cssSelector("input[id=\"register-button\"]")).submit();
		
		Thread.sleep(5000);
		
		
		// Get Text ---> Used to get the text By performing the action on the element
		
		
		// WHY..?    ----> To check Wheather we are Performing the operation based on the Req
		
		
		// AND ---->  The Element is working Based on the Requriement
		
		
		WebElement FN_Text = Q.findElement(By.xpath("//span[text()='First name is required.']"));
		
		String A = FN_Text.getText();
		
		
		System.out.println(A);
		
		

		
        WebElement LN_Text = Q.findElement(By.xpath("//span[text()='Last name is required.']"));
		
		String B = LN_Text.getText();
		
		
		System.out.println(B);
		
		
			
	 WebElement Email_Text = Q.findElement(By.xpath("//span[text()='Email is required.']"));
				
				String C = Email_Text.getText();
				
				
				System.out.println(C);
				
				
				
				
				
				
	 WebElement Password_Text = Q.findElement(By.xpath("//span[text()='Password is required.'and @for='Password']"));
					
					String D = Password_Text.getText();
					
					
					System.out.println(D);
					
				
			
		
	 WebElement Password_Text_2 = Q.findElement(By.xpath("//span[text()='Password is required.' and @for='ConfirmPassword']"));
						
						String E = Password_Text.getText();
						
						
						System.out.println(E);
						
					
				
			
		
		
		
	}

}
