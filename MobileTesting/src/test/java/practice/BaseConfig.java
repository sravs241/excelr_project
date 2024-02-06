package practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class BaseConfig {
	public AndroidDriver driver;
	
	@Test
	public void ConfigAppium() throws MalformedURLException {
		
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\srava\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(30)).build();
		service.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 

//		 AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\srava\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				 .withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(30)).build();
//		 service.start();
//	if (service.isRunning()) {
//        System.out.println("Appium server started successfully!");
//    }
//
//		 //create capabilities
//		 UiAutomator2Options options=new UiAutomator2Options();
//		 options.setDeviceName("Pixel 6a");
//		 options.setApp(System.getProperty("user.dir")+ "\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
//		 
//		 //create object for Android Driver/IOS Driver
//		 
//		 driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
//		  if (service != null) {
//   service.stop();
//   System.out.println("Appium server stopped.");
//}
	
	}
	
	
}
