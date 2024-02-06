package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		
		//login
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn-close'][1]")).click();
		
		
		//Sales-->Orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Returns']")).click();
		
		//find total number of pages in table
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);  //captured the text "Showing 1 to 10 of 271 (28 Pages)"
		
		//int total_pages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		//System.out.println("Total number of pages:" +total_pages);
		int pages_count=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("The total number of pages: " +pages_count);
		
		for(int i=1;i<=pages_count;i++) {
			WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li/span"));
			
			System.out.println("Active page: "+active_page.getText());
			active_page.click();
			
			
		}
		
		
	}

}
