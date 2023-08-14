package test1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSwitchToTabs {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
	
	 driver.navigate().refresh();

	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("Oppo Mobile");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.facebook.com/");
	
	 ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());
     //switch to new tab
	 driver.switchTo().window(al.get(0));
	 Thread.sleep(2000);
     driver.switchTo().window(al.get(1));
	
}
}
