package test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbListbox {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    WebElement months = driver.findElement(By.id("month"));
	
	Select s = new Select(months);
	s.selectByIndex(1);
	s.selectByVisibleText("Aug");
	
	System.out.println(months.getText());
	
	
	
	
	
	
}
}
