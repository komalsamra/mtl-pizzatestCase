package Project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SocialIcon {
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
			
			WebElement acc = driver.findElement(By.className("nav-account"));
		    acc.click(); 
			
			WebElement facebook = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/div[2]/div/ul/li[1]/a/i"));
		    facebook.click(); 
		    
		   
		    
		   
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		SocialIcon myobj=new SocialIcon();
		myobj.invokeBrowser();
		

	}

}
