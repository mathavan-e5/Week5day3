package Week5Day3;



import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarah {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a [text()='STOCK MARKET ']")).click();
		
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//h2[text()='NSE Bulk Deals From Last Trading Session']/..//tr//td[3]"));
		
		int size = elements.size();
		System.out.println("row"+size);
		
		for (int i = 0; i < size ; i++) {
			String text = elements.get(i).getText();
			System.out.println(text);
			 
			
		}
		
		
	}

}
