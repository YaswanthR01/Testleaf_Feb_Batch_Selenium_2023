package week4.day5.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Uibank {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Yaswanth");
		WebElement source1= driver.findElement(By.xpath("//select[@id='title']"));
		Select dropdown =new Select(source1);
		dropdown.selectByVisibleText("Mr");
		driver.findElement(By.id("middleName")).sendKeys("R");
		driver.findElement(By.id("lastName")).sendKeys("Yaswanth");
		WebElement source2 = driver.findElement(By.xpath("//select[@id='sex']"));
		Select dropdown2 = new Select(source2);
		dropdown2.selectByVisibleText("Male");
		WebElement source3 = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select dropdown3 = new Select(source3);
		dropdown3.selectByVisibleText("Full-time");
		driver.findElement(By.id("username")).sendKeys("Yaswanth R");
		driver.findElement(By.id("email")).sendKeys("yeshwanth06@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hello12");
		driver.close();
	}

}
