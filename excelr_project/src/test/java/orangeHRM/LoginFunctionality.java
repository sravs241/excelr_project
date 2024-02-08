package orangeHRM;


import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFunctionality {
	
	@Test(dataProvider="LoginData")
	public void login(String username,String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("(//img[@alt='client brand banner'])[1]")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
	
	}
	
	@DataProvider(parallel=true)
	public Object[][] LoginData(){
		Object[][] data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="test123";
		
		data[2][0]="admin";
		data[2][1]="test";
		
		return data;
		
		
	}

}
