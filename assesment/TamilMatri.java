package week4.day5.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TamilMatri {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("REGISTERED_BY")).sendKeys("Myself");
		driver.findElement(By.className("hp-regform-txtfield")).sendKeys("Kumar");
		driver.findElement(By.className("hp-gender")).click();
		driver.findElement(By.id("EMAIL")).sendKeys("yeshwanth06");
		driver.findElement(By.name("PASSWD1")).sendKeys("yasss");
		WebElement source= driver.findElement(By.id("DOBDAY"));
		Select dropdown1 = new Select(source);
		dropdown1.selectByVisibleText("8"); 
		WebElement source2= driver.findElement(By.id("DOBMONTH")); 
		Select dropdown2 =new Select(source2);
		dropdown2.selectByVisibleText("Mar");
		WebElement source3= driver.findElement(By.id("DOBYEAR"));
		Select dropdown3 = new Select(source3);
		dropdown3.selectByVisibleText("2002");
		WebElement source4= driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select dropdown4 =new Select(source4);
		dropdown4.selectByVisibleText("Hindu");
		driver.findElement(By.id("MOTHERTONGUE")).sendKeys("Telugu");
		WebElement source5= driver.findElement(By.id("COUNTRY"));
		Select dropdown5 =new Select(source5);
		dropdown5.selectByVisibleText("India");
		driver.findElement(By.id("MOBILENO")).sendKeys("6945237896");
		driver.findElement(By.id("EMAIL")).sendKeys("abcde@gmail.com");
		driver.findElement(By.xpath("(//input[@id='PASSWORD'])[3]")).sendKeys("Password");
		driver.close();
	}

}
