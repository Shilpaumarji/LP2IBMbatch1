package Demo1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class quiz {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\shilpa-backup\\Selenium jars\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Expectedtitle = "OrangeHRM";
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String Actualtitle = driver.getTitle();
		if (Expectedtitle.equals(Actualtitle))
		{
			System.out.println("Text Matching");
		}
		else
		{
			System.out.println("Test not matching");
		}
		
		
		
		//driver.close();
		//driver.quit();

	}

}
