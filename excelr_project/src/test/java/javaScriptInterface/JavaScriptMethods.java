package javaScriptInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptMethods {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.nopcommerce.com/");
	
	//Drawing border & take screenshot
	WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'", logo);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sr=ts.getScreenshotAs(OutputType.FILE);
	File tgt=new File(".\\Screenshot\\logo.png");
	FileUtils.copyFile(sr, tgt);
	
	//Getting title of the page
	String title=js.executeScript("return document.title;").toString();
	System.out.println(title);
	
	//click action
	//js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[normalize-space()='Register']")));

	//generate Alert
	//js.executeScript("alert('"+ "This is my alert"+ "')");
	
	//refreshing the page
	js.executeScript("history.go(0)");
	
	//Scrolling Down/up page
	//js.executeScript("window.scrollBy(0,500)");
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	//zoom page
	Thread.sleep(2000);
	js.executeScript("document.body.style.zoom='25%'");
	
	
	
}
}
