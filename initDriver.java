import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class initDriver {

	WebDriver driver=null;
	public void run(String Browser,String url)
	{
		if(Browser.equals("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		}
		else if(Browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url);
		}
	}
	
	public void typeFirstname(String text)
	{
		driver.findElement(By.name("firstname")).sendKeys(text);
	}
	
	public void typeLastname(String text)
	{
		driver.findElement(By.name("lastname")).sendKeys(text);
	}
	
	public void selectExp()
	{
		driver.findElement(By.id("exp-0")).click();
	}
	
	public void selectprofession()
	{
		driver.findElement(By.id("profession-1")).click();
	}
	
	
	
}
