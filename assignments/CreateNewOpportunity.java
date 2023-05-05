package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateNewOpportunity {
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
    driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
    driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Salesforce Automation by Yaswanth");
    driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
    driver.findElement(By.xpath("//button[text()='Today']")).click();
    driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[1]")).click();
    driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[3]")).click();
    driver.findElement(By.xpath("//button[contains(@class,'slds-button_b')]")).click();
    
	
	}
}
