package school;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calendar1 {
WebDriver driver;
	
	@Test
	public void bfr() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.gurukultech.com/web/");
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[3]/li")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='sub_School']/li[2]/a")).click();
	    
	    
}
	@Test(priority=5)
	public void oct_holiday() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[2]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[7]/div")).getText());

	}
	
	@Test(priority=6)
	public void dec_holiday() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[2]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[11]/div")).getText());
	}
}
