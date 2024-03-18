package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class OrganizationsTest {
	
		
		
	

			@Test
			public void organizations() throws IOException, InterruptedException {
//				
//				PropertyFileUtil putil=new PropertyFileUtil();
//				WebDriverUtil wutil=new WebDriverUtil();
				WebDriver d=new ChromeDriver();
				d.get("http://localhost:8888/");
				
				//to read data from property file
//				String URL = putil.getDataFromPropertyFile("Url");
//				String USERNAME= putil.getDataFromPropertyFile("Username");
//				String PASSWORD= putil.getDataFromPropertyFile("Password");
//			
//				//to launch the Application
//				d.get(URL);
//				
//				//to maximize the window
//				wutil.Maximize(d);
//				
//				//to apply wait for findelement method
//				wutil.implicitwait(d);
//				
//				
//				//to read from excel sheet
//				Thread.sleep(2000);
//				
//				
//				
			
				//to login to Application
				d.findElement(By.name("user_name")).sendKeys("admin");
				d.findElement(By.name("user_password")).sendKeys("admin");
				d.findElement(By.id("submitButton")).click();
	}

}
