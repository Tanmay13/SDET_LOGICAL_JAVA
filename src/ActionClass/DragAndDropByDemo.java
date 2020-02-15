package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Tanmay_Selenium_All_Project_Path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("The current Title of webpage is : " +title );
		//move element in horizontal direction by 100 pixels
		WebElement draggable=driver.findElement(By.id("dragdiv"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(draggable, 100, 0).build().perform();
		
		//Generate javascript alert
		JavascriptExecutor javascript=(JavascriptExecutor)driver;
		javascript.executeScript("alert('The element is moved by 100 pixels in x direction');");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		//Move element in vertical direction by 100 pixels
		new Actions(driver).dragAndDropBy(draggable, 0, 100).build().perform();
		//Generate javascript alert
		javascript.executeScript("alert('The element is moved by 100 pixels in y direction');");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//Move element in horizontal and vertical direction by -100 pixels
		Actions action1=new Actions(driver);
		Action draganddropby=action1.dragAndDropBy(draggable, -100, -100).build();
		draganddropby.perform();
		//Generate javascript alert
		javascript.executeScript("alert('The element is moved by -100 pixels in x direction & y direction');");
		Thread.sleep(5000);
		
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//System.out.println(text);
		driver.close();
	}
}
