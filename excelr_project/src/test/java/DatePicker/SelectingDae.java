package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingDae {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		String year="2024";
		String month="Oct";
		String date="17";
		  
		while(true) {
		String monthyear=driver.findElement(By.id("onward_cal")).getText();
		String arr[]=monthyear.split("");
		
		String mon=arr[0];
		String yr=arr[1];
		
		
		if( mon.equalsIgnoreCase(month) && yr.equals(year))
			break;
		else driver.findElement(By.xpath(mon));
		}
		
		
		
		
	}

}
