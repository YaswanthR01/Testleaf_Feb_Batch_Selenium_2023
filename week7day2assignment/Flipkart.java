package week7.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement mens = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions move =new Actions(driver);
		move.moveToElement(mens).perform();
		WebElement men = driver.findElement(By.linkText("Men's Top Wear"));
		move.moveToElement(men);
		driver.findElement(By.linkText("Men's T-Shirts")).click();
		WebElement min = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
		Select price = new Select(min);
		price.selectByIndex(3);
	}

}
