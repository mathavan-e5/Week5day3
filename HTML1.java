package Week5Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//h2[text()='Attributes of Create An HTML Table Quickly & Easily With Our Code Example']/..//tr"));
		int size = list.size();
		System.out.println("row"+size);
		
		
		List<WebElement> list1 = driver.findElements(By.xpath("//h2[text()='Attributes of Create An HTML Table Quickly & Easily With Our Code Example']/..//td"));
		int size2 = list1.size();
		System.out.println("Column"+size2);
		
		
		
	}

}
