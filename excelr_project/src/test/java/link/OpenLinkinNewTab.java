package link;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkinNewTab {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/tooltip/");
	driver.manage().window().maximize();
	//driver.findElement(By.linkText("Plugins")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	//driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://google.com");
	
}
}
