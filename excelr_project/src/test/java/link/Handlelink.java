package link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlelink {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		//driver.findElement(By.partialLinkText("miniTV")).click();
		
		//How to capture all the links in a webpage
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of links: "+ links.size());
		/*for(int i=0;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}*/
		
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		
	}
 
}


