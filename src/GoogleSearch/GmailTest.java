package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         System.setProperty("webdriver.chrome.driver", "E:\\Tanmay_Selenium_All_Project_Path\\chromeExeNew\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']/li[2]/a")).click();
		String Title2=driver.getTitle();
		System.out.println("Title 2 is:"+Title2);
		//driver.findElement(By.xpath("//ul[@class='OVnw0d']/li[3]")).click();
		//String Title3=driver.getTitle();
		//System.out.println("Title 3 is:"+Title3);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("8600421149");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
