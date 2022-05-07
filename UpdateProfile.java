package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sitha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://tanchan-001-site3.btempurl.com/production/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("LEmail")).sendKeys("test1234@gmail.com");
		driver.findElement(By.id("LPwd")).sendKeys("Password1");
		driver.findElement(By.id("LBtn")).click();
		driver.findElement(By.id("dropdown03")).click();
		driver.findElement(By.xpath("//*[@id=\"AuthLink\"]/div/a[2]")).click();
		driver.findElement(By.id("UAddress_2"));
		driver.findElement(By.xpath("//*[@id=\"UBtn\"]")).click();
		driver.findElement(By.id("dropdown01")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[2]/div/a")).click();
		driver.findElement(By.id("LQCoverage")).sendKeys("$5000");
		driver.findElement(By.id("LQZip")).sendKeys("89001");
		driver.findElement(By.id("LQDob")).sendKeys("04/11/2006");
		driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[2]/label")).click();
		driver.findElement(By.id("LQHeightF")).sendKeys("5");
		driver.findElement(By.id("LQHeightI")).sendKeys("5");
		driver.findElement(By.id("LQWeight")).sendKeys("180");
		driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[4]/div[2]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[5]/div[2]/div[2]/label")).click();
		driver.findElement(By.id("LQBtn")).click();
		driver.findElement(By.id("LQCoverage")).click();
		driver.findElement(By.id("PremMode")).click();
		driver.findElement(By.id("PlanType")).click();
		driver.findElement(By.xpath("//*[@id=\"AuthLink\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"InsPlcyInfo\"]https://github.com/Alapatis/MayAutomationAssignment.git/tr[1]/td[4]/a[1]")).click();
		driver.findElement(By.id("PPBtn")).click();
		driver.findElement(By.id("MdCrdName")).sendKeys("Yes-M Testing");
		driver.findElement(By.id("MdCrdNo")).sendKeys("4012888888881881");
		driver.findElement(By.id("MdCrdMnth")).sendKeys("05");
		driver.findElement(By.id("MdCrdYr")).sendKeys("2022");
		driver.findElement(By.id("MDPayBtn")).click();
		
		
		
		driver.close();
		driver.quit();
		
		
		
		
}

}
