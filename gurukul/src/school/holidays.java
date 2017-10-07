package school;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class holidays {
	WebDriver driver;
	@Test
	public void bfr() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.gurukultech.com/web/");
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[3]/li")).click();
	    driver.findElement(By.xpath(".//*[@id='sub_School']/li[1]/a")).click();
	    
	    
}
	 @Test(dependsOnMethods="bfr",description="To read JUN")
	 public void jun()
	 {
		
	    System.out.println(driver.findElement(By.xpath(".//*[@id='Holidaytop_0']/div[2]")).getText());
   
	 }
	    

	 
	 @Test(dependsOnMethods="jun",description="To read AUGUST")
	 public void aug()
	 {
		 int i=1;
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_1']/tr[1]/td["+i+"]"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int col=i-1;
		    System.out.println("Number of columns present in table : "+col);
		    
		    
		    
		    int j=1;
		    
		    
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_1']/tr["+j+"]/td[1]"));
		    j++;
		    }
		    }
		     catch(Throwable f)
		    {
		    	
		    }
		    int row=j-1;
		    System.out.println("Number of rows present in table : "+row);
	    
		for(int rr=1; rr<=row; rr++)
		   
	   {
		   
	
		for(int cc=1; cc<=col; cc++)
		   {
			   
			  System.out.println(driver.findElement(By.xpath(".//*[@id='holidays_1']/tr["+rr+"]/td["+cc+"]")).getText());
	
		   }
		   System.out.println();
		   
	   }
	    
} 
	 
	 @Test(dependsOnMethods="aug",description="To read SEPTEMBER")
	 public void sep()
	 {
		
		  int i=1;
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_2']/tr[1]/td["+i+"]"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int col=i-1;
		    System.out.println("Number of columns present in table : "+col);
		    
		    
		    
		    int j=1;
		    
		    
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_2']/tr["+j+"]/td[1]"));
		    j++;
		    }
		    }
		     catch(Throwable f)
		    {
		    	
		    }
		    
		   int row=j-1;
		    System.out.println("Number of rows present in table : "+row);
		    
		    
	    
		for(int rr=1; rr<=row; rr++)
		   
	   {
		   
	
		for(int cc=1; cc<=col; cc++)
		   {
			   
			  System.out.println(driver.findElement(By.xpath(".//*[@id='holidays_2']/tr["+rr+"]/td["+cc+"]")).getText());
	
		   }
		   System.out.println();
		   
	   }
	    
}  
	 @Test(dependsOnMethods="sep",description="To read OCTOBER")
	 public void oct()
	 {
		
		 int i=1;
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_3']/tr[1]/td["+i+"]"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int col=i-1;
		    System.out.println("Number of columns present in table : "+col);
		    
		    
		    
		    int j=1;
		    
		    
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_3']/tr["+j+"]/td[1]"));
		    j++;
		    }
		    }
		     catch(Throwable f)
		    {
		    	
		    }
		    
		   int row=j-1;
		    System.out.println("Number of rows present in table : "+row);
		    
		for(int rr=1; rr<=row; rr++)
		   
	   {
		   
		
		for(int cc=1; cc<=col; cc++)
		   {
			   
			  System.out.println(driver.findElement(By.xpath(".//*[@id='holidays_3']/tr["+rr+"]/td["+cc+"]")).getText());
	
		   }
		   System.out.println();
		   
	   }
	    
}   
	 
	 @Test(dependsOnMethods="oct",description="To read DECEMBER")
	 public void dec()
	 {
		
		 int i=1;
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_4']/tr[1]/td["+i+"]"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int col=i-1;
		    System.out.println("Number of columns present in table : "+col);
		    
		    
		    
		    int j=1;
		    
		    
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_4']/tr["+j+"]/td[1]"));
		    j++;
		    }
		    }
		     catch(Throwable f)
		    {
		    	
		    }
		    
		   int row=j-1;
		    System.out.println("Number of rows present in table : "+row);
		    
	    
		for(int rr=1; rr<=row; rr++)
		   
	   {
		   
		
		for(int cc=1; cc<=col; cc++)
		   {
			   
			  System.out.println(driver.findElement(By.xpath(".//*[@id='holidays_4']/tr["+rr+"]/td["+cc+"]")).getText());
	
		   }
		   System.out.println();
		   
	   }
	    
} 
	 
	 @Test(dependsOnMethods="dec",description="To read JANUARY")
	 public void jan()
	 {
		
		 int i=1;
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_5']/tr[1]/td["+i+"]"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int col=i-1;
		    System.out.println("Number of columns present in table : "+col);
		    
		    
		    
		    int j=1;
		    
		    
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_5']/tr["+j+"]/td[1]"));
		    j++;
		    }
		    }
		     catch(Throwable f)
		    {
		    	
		    }
		    
		   int row=j-1;
		    System.out.println("Number of rows present in table : "+row);
		    
		for(int rr=1; rr<=row; rr++)
		   
	   {
		   
		
		for(int cc=1; cc<=col; cc++)
		   {
			   
			  System.out.println(driver.findElement(By.xpath(".//*[@id='holidays_5']/tr["+rr+"]/td["+cc+"]")).getText());
	
		   }
		   System.out.println();
		   
	   }
	    
} 	
	 
	 @Test(dependsOnMethods="jan",description="To read MARCH")
	 public void mar()
	 {
		
		 int i=1;
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_6']/tr[1]/td["+i+"]"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int col=i-1;
		    System.out.println("Number of columns present in table : "+col);
		    
		    
		    
		    int j=1;
		    
		    
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_6']/tr["+j+"]/td[1]"));
		    j++;
		    }
		    }
		     catch(Throwable f)
		    {
		    	
		    }
		    
		   int row=j-1;
		    System.out.println("Number of rows present in table : "+row);
		for(int rr=1; rr<=row; rr++)
		   
	   {
		   
		
		for(int cc=1; cc<=col; cc++)
		   {
			   
			  System.out.println(driver.findElement(By.xpath(".//*[@id='holidays_6']/tr["+rr+"]/td["+cc+"]")).getText());
	
		   }
		   System.out.println();
		   
	   }
	    
} 	
}