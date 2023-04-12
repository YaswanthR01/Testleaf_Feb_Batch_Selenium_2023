package week7.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://leafground.com/drag.xhtml");
		WebElement drag = drive.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions action = new Actions(drive);
		action.dragAndDropBy(drag, 333, 1).perform();
		action.dragAndDropBy(drag, -180, 0).perform();
		WebElement dragme = drive.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drop = drive.findElement(By.xpath("//span[text()='Droppable Target']"));
		action.dragAndDrop(dragme, drop).perform();
	}

}
