package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled_For_Login_Button {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver F = new ChromeDriver();
		
		F.manage().window().maximize();
		
		F.get("https://www.instagram.com/");
		
		
		Thread.sleep(10000);
		
		WebElement Login_Btn = F.findElement(By.xpath("//div[@class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"]"));
		
		boolean H = Login_Btn.isEnabled();
		

		if(H) {
			
			System.out.println("The BUTTON IS ENABLED");
			
			Login_Btn.click();
		
		}
		
		else {
			
			System.out.println("IT IS NOT ENABLED");
		}
	}

}
