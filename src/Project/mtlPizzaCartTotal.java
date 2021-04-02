package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtlPizzaCartTotal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/views/dashboard.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"addPizzaBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addPizzaBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addSaladBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addSandwichBtn\"]")).click();


		Thread.sleep(4000);
		String at = driver.getTitle();
		String et = "mtlPizza";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("test fail");
		}
		else
		{
			System.out.println("test Success");
		}
	}

}
