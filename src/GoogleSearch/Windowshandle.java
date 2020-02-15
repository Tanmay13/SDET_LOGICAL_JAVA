package GoogleSearch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowshandle {

	@Test
	public void Windowa() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Tanmay_Selenium_All_Project_Path\\chromeExeNew\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.naukri.com/");

		String Parant = driver.getWindowHandle();
		System.out.println("The Parant windwos is:"+Parant.toString());
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child
			// window then we will close

			if (!Parant.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(Parant);

	}

}
