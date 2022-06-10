package Week5Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.None;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML2 { 
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://html.com/tags/table");
	driver.manage().window().maximize();
	
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='render']//table//tr//td"));
	
	for (int i = 0; i <4; i++) {
		String text=elements.get(i).getText();
		System.out.println(text);
		
	}
	 for (int i = 4; i <8; i++) {
		 String text2=elements.get(i).getText();
		 System.out.println(text2);
		
	}
	
 
	}
}
