package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class window_1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver A = new EdgeDriver();
		
		A.get("https://www.fireflink.com/");
		
		Thread.sleep(3000);
		
		
		
		
		A.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		
		
		
		Dimension Q = A.manage().window().getSize();   // To get the Total Size
		
		
		System.out.println("Total get Size" +Q);
		
		
		
		
		int a  = A.manage().window().getSize().getHeight();   // To get the height Individually
		
		
		
		System.out.println("get_Size Height"+a);
		
		
		
		
		int b  = A.manage().window().getSize().getWidth();    // To get the Width Individually
		
		
		
		System.out.println("get_Size Width"+b);
		
		
		
		
		
		
		//SetSize
		
		
		Dimension W = new Dimension(600, 850);
		
		
		A.manage().window().setSize(W);
		
		
		
		System.out.println("Explicit Set_Size" +W);
		
		
		
		
		Dimension  R = A.manage().window().getSize();
		
		System.out.println("Ater Set the Size We are getting the size"+R);
		
	
	}

}
