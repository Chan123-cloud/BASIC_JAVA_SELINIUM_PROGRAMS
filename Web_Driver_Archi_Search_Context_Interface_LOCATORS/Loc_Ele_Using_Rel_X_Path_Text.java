package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Ele_Using_Rel_X_Path_Text {
	
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver Y = new ChromeDriver();
	
	Y.manage().window().maximize();
	
	Y.get("https://www.shoppersstack.com/");
	
	Thread.sleep(30000);
	
	Y.findElement(By.xpath("//button[text()='Login']")).click();
	
}

}
