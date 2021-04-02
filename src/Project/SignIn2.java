package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignIn2 {
	WebDriver driver;
	Actions actions1;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hy\\Selnium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("file:///C:/Users/hy/Desktop/Pizza/pizzaBrother/views/home.html");
					
			actions1= new Actions(driver);
		
			WebElement account = driver.findElement(By.className("nav-account"));
		    account.click();
		
		    WebElement name = driver.findElement(By.id("your_name"));
			name.sendKeys("test1"); 
			
		
		WebElement pass = driver.findElement(By.id("your_pass"));
		pass.sendKeys("test1"); 
		
		WebElement sign = driver.findElement(By.id("signin"));	
		sign.click();
		
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		SignIn2 myobj=new SignIn2();
		myobj.invokeBrowser();
			
			
	}

}
