package link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {
	public static void main(String[] args) throws IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> brokenlinks=  driver.findElements(By.tagName("a"));
		int broken=0;
		for(WebElement element:brokenlinks)
		{
			
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty()) {
				System.out.println("url is empty");
				continue;
			}
			URL link = new URL(url);
			try {
				
				HttpURLConnection httoconn=(HttpURLConnection)link.openConnection();
				httoconn.connect();
				if(httoconn.getResponseCode()>=400) {
					System.out.println(httoconn.getResponseCode()+ " "+ url+"  is"+"  Broken link");
					broken++;
				}else {
					System.out.println(httoconn.getResponseCode()+" "+ url+ "  is"+"  not Broken link");
				}
				
			} catch (MalformedURLException e) {
				System.err.println("Error: Unable to resolve the host or domain name.");
			    e.printStackTrace();
			}
			
		}
		System.out.println("number of brokenlinks: "+broken);
		driver.quit();
		
	}

}
