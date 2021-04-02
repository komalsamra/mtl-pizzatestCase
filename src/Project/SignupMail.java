package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class SignupMail {
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
		    
		    WebElement name = driver.findElement(By.id("name"));
	        name.sendKeys("kamalpreet"); 
		
			actions1.click(driver.findElement(By.id("email")))
			.sendKeys("ksamra138gmail.com"+Keys.TAB)	
			.build()
			.perform();
			
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys("komal123"); 
			
			WebElement repass = driver.findElement(By.id("re_pass"));
			repass.sendKeys("komal123");
			
			WebElement submit = driver.findElement(By.id("signup"));	
			submit.click();
			
	        
			
			
			
 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		SignupMail myobj=new SignupMail();
		myobj.invokeBrowser();
		
		

	}

}
