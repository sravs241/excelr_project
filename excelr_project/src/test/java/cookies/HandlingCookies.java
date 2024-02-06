package cookies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
		//How many cookies are captured
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());
	
		//how to print cookies from browser
		for(Cookie cookie: cookies) {
			System.out.println(cookie.getName()+ " : "+cookie.getValue());
		}
		
		//how to add the cookie to the browser
		Cookie cookieobj=new Cookie("MyCookie123","123456");
		driver.manage().addCookie(cookieobj);
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie: cookies) {
			System.out.println(cookie.getName()+ " : "+cookie.getValue());
		}
		
		//How to delete specific cookie from the browser
		//driver.manage().deleteCookie("MyCookie123");
		driver.manage().deleteCookieNamed("MyCookie123");
		cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies after deletion: "+cookies.size());
		
		
		//How to delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies after deletion: "+cookies.size());
	}

}
