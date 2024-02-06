package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//	Thread.sleep(3000);
//	//Alert window with OK button
//	driver.switchTo().alert().accept();
	
	//Alert window with ok & cancel button
//	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//	Thread.sleep(3000);
//	//driver.switchTo().alert().accept();  //Close alert by using ok button
//	
//	driver.switchTo().alert().dismiss();   //close alert by using cancel button
	
	//Alert window with input box, capture text from alert
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	Thread.sleep(3000);
	Alert alerwindow=driver.switchTo().alert();
	System.out.println(alerwindow.getText());
	alerwindow.sendKeys("welcome");
	alerwindow.accept();
	
	
}
}
