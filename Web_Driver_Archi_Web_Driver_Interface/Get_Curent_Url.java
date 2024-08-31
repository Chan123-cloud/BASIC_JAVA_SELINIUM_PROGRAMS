package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.edge.EdgeDriver;

public class Get_Curent_Url {
	
	public static void main(String[] args) {
		
      EdgeDriver e = new EdgeDriver();
	
	e.get("https://www.fireflink.com/");
	
	
	String S = e.getCurrentUrl();   
	
	System.out.println(S);
	
	
	
	System.out.println(e.getCurrentUrl());
		
	}

}
