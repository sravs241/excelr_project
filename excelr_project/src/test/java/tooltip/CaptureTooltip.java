package tooltip;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTooltip {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://jqueryui.com/tooltip/");
//		driver.manage().window().maximize();
//		driver.switchTo().frame(0);
//		Actions act=new Actions(driver);
//		WebElement inputbox= driver.findElement(By.xpath("//a[normalize-space()='ThemeRoller']"));
//		String tooltiptext=inputbox.getAttribute("href");
//		System.out.println(tooltiptext);
		driver.get("https:www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tshirt");
		
		List<WebElement> searchbox=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//span"));
		
		for(WebElement search:searchbox) {
			System.out.println(search.getText());
		}
	}

}
