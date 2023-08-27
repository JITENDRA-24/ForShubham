package test1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpb {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().deleteAllCookies();
	//driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	WebElement countryCode = driver.findElement(By.xpath("(//img[contains(@class,'ce')])[2]"));
	countryCode.click();
	WebElement spain = driver.findElement(By.xpath("//ul[@id='central-login-country-list']/li//span[text()='SPAIN']")); // Replace the XPath with the actual XPath for your desired country code

	//scroll to element visible    
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",spain);
	wait.until(ExpectedConditions.visibilityOf(spain));
	wait.until(ExpectedConditions.elementToBeClickable(spain));
	System.out.println(spain.getText());
	spain.click();

	Thread.sleep(2000);
	driver.close();
}
}
