package com.aws.AutoWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleTest {
	
	@Test
	public void registrationTest()
	{
		System.out.println("starting registration test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\Desktop\\\\Harsh\\\\Mphasis\\\\JAR files\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sleep(3000);
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://accounts.lambdatest.com/register");
		System.out.println("page is opened");
		driver.findElement(By.name("name")).sendKeys("Harsh");
		sleep(1500);
		driver.findElement(By.name("email")).sendKeys("harshkurulkar7@gmail.com");
		sleep(1500);
		driver.findElement(By.name("password")).sendKeys("Harsh@123");
		sleep(1500);
		driver.findElement(By.name("phone")).sendKeys("7823187272");
		sleep(1500);
		driver.findElement(By.cssSelector("#org_name")).sendKeys("abc");
		sleep(1500);
		Select drop = new Select ( driver.findElement(By.cssSelector("#designation")));
		drop.selectByVisibleText("Student / Freelancer");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/label/samp")).click();
		sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button")).click();
		sleep(1500);
		
		 driver.quit();
		
		
		
	}
	
	@Test
	public void loginTest() {
		
		System.out.println("starting login test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\Desktop\\\\Harsh\\\\Mphasis\\\\JAR files\\\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
	
		sleep(3000);
		
		
		driver.manage().window().maximize();
		
		String url = "https://the-internet.herokuapp.com/login";
		
		driver.get(url );
		System.out.println("page is opened");
		
		
		sleep(2000);
		
		
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		sleep(1500);
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		sleep(3000);
		
		
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		sleep(5000);
		

}
	
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
