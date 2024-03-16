package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactsTest {
@Test
	public void createContacts() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
	}
}
