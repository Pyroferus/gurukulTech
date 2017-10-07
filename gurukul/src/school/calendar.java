package school;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class calendar
{
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
	@Test(priority=1)
	public void functionality_validation()
	{
		/*driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[4]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[3]/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[3]/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[3]/span[3]")).click();
		
	*/
	
	}
	
	@Test(priority=2)
	public void jun_holiday() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[1]")).click();
   	
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[10]/div")).getText());
		}

	@Test(priority=3)
	public void aug_holiday() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		   	System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[6]/div")).getText());
		   	System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[7]/div")).getText());
			System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[10]/div")).getText());
	}

	@Test(priority=4)
	public void sep_holiday() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[2]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[10]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[11]/div")).getText());
	}

	@Test(priority=5)
	public void oct_holiday() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		
	   
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[2]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[7]/div")).getText());

	}
	
	@Test(priority=6)
	public void dec_holiday() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[2]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[11]/div")).getText());
	}

	@Test(priority=7)
	public void jan_holiday() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[2]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[6]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[7]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[8]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[11]/div")).getText());
	}	


	@Test(priority=8)
	public void mar_holiday() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='calendar']/table/tbody/tr/td[1]/span[2]")).click();
				
		
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[10]/div")).getText());
		System.out.println(driver.findElement(By.xpath(".//*[@id='calendar']/div/div/div/div[11]/div")).getText());

	}



}



	 

