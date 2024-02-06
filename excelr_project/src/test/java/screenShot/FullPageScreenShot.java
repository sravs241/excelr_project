package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScreenShot {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://www.redbus.com/");
		driver.get("https://google.com");
		driver.manage().window().maximize();

		// Full Page screenshot
		
		  TakesScreenshot ts=(TakesScreenshot)driver; File
		  src=ts.getScreenshotAs(OutputType.FILE); File trg=new
		  File(".\\Screenshot\\homepage.png"); FileUtils.copyFile(src, trg);
		 

		// Screenshot of portion/section of the page
		
		  WebElement
		  search=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
		  File src=search.getScreenshotAs(OutputType.FILE); 
		  File trg=new File(".\\Screenshot\\homepage.png"); 
		  FileUtils.copyFile(src, trg);
		 

		// Screenshot of element of the page
		
//		  WebElement
//		  search=driver.findElement(By.xpath("//img[@alt='Google']"));
//		  File src=search.getScreenshotAs(OutputType.FILE); File trg=new
//		  File(".\\Screenshot\\homepage.png");
//		  FileUtils.copyFile(src, trg);
		 
		
	}

}
