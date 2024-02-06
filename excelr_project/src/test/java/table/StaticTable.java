package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices");
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		
		int row= driver.findElements(By.xpath("//table[@id='dataTable']//tr")).size();
		System.out.println("Total rows: "+row);
		
		int cols= driver.findElements(By.xpath("//table[@id='dataTable']//tr/th")).size();
		System.out.println("Total columns: "+cols);
		WebElement BSE200=driver.findElement(By.xpath("//table[@id='dataTable']//tr[3]/td[3]"));
		
		System.out.println(BSE200.getText());
		
//		for(int i=1;i<row;i++) {
//			for(int j=1;j<cols;j++) {
//				String data=driver.findElement(By.xpath("//table[@id='dataTable']//tr["+i+"]/td["+j+"]")).getText();
//				System.out.print(data+ "  ");
//			}
//			System.out.println();
//	
//		}
		
		for(int i=1;i<row;i++){
			String indice=driver.findElement(By.xpath("//table[@id='dataTable']//tr["+i+"]/td[1]")).getText();
			if(indice.equals("S&P BSE SmallCap")) {
				String PrevClose=driver.findElement(By.xpath("//table[@id='dataTable']//tr["+i+"]/td[2]")).getText();
				String LastTraded=driver.findElement(By.xpath("//table[@id='dataTable']//tr["+i+"]/td[3]")).getText();
				System.out.println(indice+" "+PrevClose+" "+LastTraded);
			}
		}
		

}
}