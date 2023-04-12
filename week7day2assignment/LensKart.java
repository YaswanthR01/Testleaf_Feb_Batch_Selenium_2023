package week7.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LensKart {
	public static void main(String[] args) {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications"); 
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.lenskart.com");
		WebElement cglass = driver.findElement(By.xpath("//*[text()='COMPUTER GLASSES']"));
		Actions action =new Actions(driver);
		action.moveToElement(cglass).perform();
		WebElement child = driver.findElement(By.xpath("(//span[text()='kids'])[2]"));
		action.moveToElement(child).perform();
		driver.findElement(By.xpath("//span[text()='Kids Glasses']")).click();
	}

}
