package week4.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Feb");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yaswanth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yas");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("wanth");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("week4 day 3 assignment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yeshwanth0606@gmail.com");
		WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown =new Select(source);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Enterprises");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kumar");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
	}

}
