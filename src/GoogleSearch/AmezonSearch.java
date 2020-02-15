package GoogleSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmezonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "E:\\Tanmay_Selenium_All_Project_Path\\chromeExeNew\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_Cj0KCQiAuefvBRDXARIsAFEOQ9FXz6hJeOMj0YSAcfR12qNk93TP4N7ZI3bLN0cFf4BctzNotiOzvSwaAuesEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiAuefvBRDXARIsAFEOQ9FXz6hJeOMj0YSAcfR12qNk93TP4N7ZI3bLN0cFf4BctzNotiOzvSwaAuesEALw_wcB");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Search=driver.findElement(By.xpath("//input[@dir='auto']"));
		Search.sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement Mobile=driver.findElement(By.xpath("//div[@class='block desktopSparkle__featuredBrandContainer']/div[2]/div/div[2]/a/div/span"));
		Mobile.click();
		String Title=driver.getCurrentUrl();
		System.out.println(Title);
		WebElement Notify= driver.findElement(By.xpath("//span[text()='Notify Me']"));
		Notify.click();
		
		String Title2=driver.getCurrentUrl();
		System.out.println(Title2);
		/*Actions Act=new Actions(driver);
		Act.moveToElement(Notify).click();*/
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8600421149");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//a[@tabindex='3']")).click();
		driver.findElement(By.xpath("//input[@tabindex='3']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("789789");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		
	
		

	}

}
