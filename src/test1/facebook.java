package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().deleteAllCookies();
	//driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("keyac58317@syswift.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("TJ@XYZ");
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).click();
	driver.findElement(By.xpath("//span[text()='Amol Khamkar']")).click();
	driver.findElement(By.xpath("//span[text()='Message']")).click();
	
	

	for(int i=1; i<=10; i++) {
		System.out.println("for loop starts"+i);
		driver.findElement(By.xpath("//p[@class='xat24cr xdj266r']")).sendKeys("automatic 10 timies");
		driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']")).click();
	}
	

	driver.findElement(By.xpath("//div[@aria-label='Close chat']")).click();
	driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
	driver.findElement(By.xpath("//span[text()='Log out']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
