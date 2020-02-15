package GoogleSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:\\Tanmay_Selenium_All_Project_Path\\chromeExeNew\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Search=driver.findElement(By.xpath("//input[@name='q']"));
		Search.sendKeys("AkshayKumar");
		
		List<WebElement> GoogleList=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println(GoogleList.size());
		
		for(int i=0;i<GoogleList.size();i++)
		{
			String ActualListitem=GoogleList.get(i).getText();
			System.out.println(ActualListitem);
			if(ActualListitem.contains("akshay kumar"))
			{
				
				GoogleList.get(i).click();
				break;
			}
			
		}

		

	}

}
