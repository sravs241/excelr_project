package scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUpandDown {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("http://timesofindia.com");
	//WebElement auto=driver.findElement(By.xpath("(//a[@class='hpKNW'])[2]"));
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	//js.executeScript("arguments[0].scrollIntoView();", auto);
//	
//	//js.executeScript("window.scrollBy(0,5000)");
//	
//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	//using actions
//	Actions act=new Actions(driver);
//	act.moveToElement(auto).perform();
	
	//using keys
	WebElement body=driver.findElement(By.tagName("body"));
	body.sendKeys(Keys.END);
	
}
}
