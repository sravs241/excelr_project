package iframe;

import java.awt.Frame;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleIFrames {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.guru99.com/handling-iframes-selenium.html");
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total iframes: "+size);
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementID")));
    // Find the iframe by its index (assuming it's the first iframe on the page)
   
   //WebElement ele= driver.findElement(By.id("google_ads_iframe_/24132379/guru99_incontent_1_0"));
   WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(size));
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("google_ads_iframe_/24132379/guru99_incontent_1_0")));
   driver.switchTo().frame("google_ads_iframe_/24132379/guru99_incontent_1_0");
     }          
}

