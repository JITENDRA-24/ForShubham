package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Totallinks {
public static void main(String[] args) throws InterruptedException {
				
	   // WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  // up casting
		driver.get("https://demo.guru99.com/popup.php");

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getText()+": "+links.get(i).getAttribute("href"));
		}
		driver.quit();
}
}