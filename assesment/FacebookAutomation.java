package week4.day5.assesment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAutomation {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9958637826");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Febbatch*02");
		WebElement source=driver.findElement(By.id("day"));
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("23");
		WebElement source2= driver.findElement(By.id("month"));
		Select dropdown2 =new Select(source2);
		dropdown2.selectByVisibleText("Apr");
		WebElement source3=driver.findElement(By.id("year"));
		Select dropdown3 =new Select(source3);
		dropdown3.selectByVisibleText("2003");
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		driver.close();
	}

}
