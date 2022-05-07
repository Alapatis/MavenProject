package businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	public static WebDriver driver=null;

	public static void Openbrowser()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sitha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver=new ChromeDriver();

		driver.get("http://tanchan-001-site3.btempurl.com/production/");

	}
	public static void CloseBrowser() {
		driver.close();
		driver.quit();

	}
}
