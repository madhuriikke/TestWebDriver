import com.edusol.salenium.ChromeDriver;

import com.edusol.salenium.FirefoxDriver;
import com.edusol.salenium.WebDriver;

public class TestWebDriver {

	public static void main(String[] args) {
		
		/*ChromeDriver  driver =new ChromeDriver();
		  driver.click("Button");
		  driver.sendkeys("Text Box", "Hello");
	   */
		
		/*
		 * FirefoxDriver driver =new FirefoxDriver(); driver.click("Button");
		 * driver.sendkeys("Text Box", "Hello");
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.click("Button");
		driver.sendkeys("Text Box", "Hello");

	}
}
