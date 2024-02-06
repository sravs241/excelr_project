package slider;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSlider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		
		WebElement Womanfashion=driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
		WebElement kurtas=driver.findElement(By.xpath("//span[normalize-space()='Kurtas & Kurtis']"));
		Actions act=new Actions(driver);
		act.moveToElement(Womanfashion).click(kurtas).build().perform();	
//		WebElement min_slider=driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
//		System.out.println("Location of the slider:" +min_slider.getLocation());  //(110, 397)
//		System.out.println("Size of the slider:" +min_slider.getSize());   //(13, 13)
//		//act.dragAndDropBy(min_slider, 120, 0).perform();
//		System.out.println("Location of the slider:" +min_slider.getLocation());  //(110, 397)
//		System.out.println("Size of the slider:" +min_slider.getSize());   //(13, 13)
		
		WebElement max_slider=driver.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		System.out.println("Location of the max slider: "+max_slider.getRect().getX());//(233, 395)
		System.out.println("Size of the max slider:"+max_slider.getSize());
		//act.dragAndDropBy(max_slider, -100, 0).perform();
		act.clickAndHold(max_slider).moveByOffset(-100, 0).perform();
	}

}
