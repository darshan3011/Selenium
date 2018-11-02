import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicitwait {
// implicit wait
// explicitwait
// thread.sleep
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://portfolio.rediff.com/portfolio-login");
		driver.findElement(By.id("useremail")).sendKeys("abc");
		driver.findElement(By.id("emailsubmit")).click();
		// little while
		// Thread.sleep(3000);
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));
		driver.findElement(By.id("userpass")).sendKeys("pass@1234");
		

	}

}
