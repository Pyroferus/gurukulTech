package school;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid {
DesiredCapabilities cap=null;
RemoteWebDriver driver;
@Parameters("Browser")
@BeforeMethod
public void bftmethod(String val) throws MalformedURLException{
System.out.println(val);
if(val.equals("FF"))
{
	System.out.println("Launching Application-->Mozila firefox");
	cap=DesiredCapabilities.firefox();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.ANY);
	
}else if(val.equals("CH"))
{
	System.out.println("Launching Application-->Chrome Driver");
	cap=DesiredCapabilities.chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.ANY);
	 
}else if(val.equals("IE"))
{
	System.out.println("Launching Application-->Internet Explorer");
	cap=DesiredCapabilities.internetExplorer();
	cap.setBrowserName("Internet Explorer");
	cap.setPlatform(Platform.ANY);
}
driver=new RemoteWebDriver(new URL("http://Localhost:4444/wd/hub"),cap);
}
@Test
public void Validate()
{
	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=ygAzWfPUOIPy8Ae3g6igCA&gws_rd=ssl");
	System.out.println("Validate Application");
}
@AfterMethod

	public void aftmtd()
	{
		driver.quit();
		System.out.println("Close Application");
	}
}

