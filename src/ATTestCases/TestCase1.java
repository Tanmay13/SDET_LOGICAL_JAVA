package ATTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	public WebDriver driver;
	
	@BeforeTest
	public void Tearup()
	{
		

	System.setProperty("webdriver.chrome.driver", "E:\\Tanmay_Selenium_All_Project_Path\\chromeExeNew\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://practice.automationtesting.in/");
	}
	
	/*@Test(priority=1)
	public void CreateAccount()
	{
		WebElement Myacoount=driver.findElement(By.xpath("//a[text()='My Account']"));
		Myacoount.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement  UserName=driver.findElement(By.cssSelector("#reg_email"));
		UserName.sendKeys("TanmayK");
		WebElement Password=driver.findElement(By.cssSelector("#reg_password"));
		Password.sendKeys("13FB@1993");
		WebElement ClickonRegister=driver.findElement(By.xpath("//input[@value='Register']"));
		ClickonRegister.click();
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
	}*/
	
	@Test(priority=2)
	public void Login()
	{
		
		
		driver.findElement(By.cssSelector("#username")).sendKeys("TanmayK");
		driver.findElement(By.xpath("#password")).sendKeys("13FB@1993");
		driver.findElement(By.xpath("//input[@type='submit'][@name='login']")).click();
		
	}

}
