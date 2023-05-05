package assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteOpportunity {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions dri =new ChromeOptions();
		dri.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(dri);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://login.salesforce.com");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    driver.findElement(By.xpath("(//button[contains(@class,'slds-button')])[7]")).click();
	    driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	    driver.findElement(By.xpath("//p[contains(text(),'Manage your sales ')]")).click();
	    Thread.sleep(10000);
	    WebElement np = driver.findElement(By.xpath("(//a[contains(@class,'slds-context-bar')])[2]"));
		driver.executeScript("arguments[0].click()", np);
	    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Yaswanth", Keys.ENTER);
	    WebElement d = driver.findElement(By.xpath("//a[contains(@class,'keyboardMode--trigger')]"));
	    driver.executeScript("arguments[0].click()", d);
	    driver.findElement(By.xpath("//a[@title='Delete']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@title='Delete']")).click();
	    Thread.sleep(3000);
	    WebElement pr = driver.findElement(By.xpath("//span[text()='No items to display.']"));
	    System.out.println(pr.getText());
	    
	    

}}
