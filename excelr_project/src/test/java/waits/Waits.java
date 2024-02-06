package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	
	//ImplicitWait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("selenium");
	search.sendKeys(Keys.ENTER);
	//driver.findElement(By.name("q")).click();
	
	//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
}
}
