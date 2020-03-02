import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo  {
	WebDriver driver;
  @Test
  public void Demo() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://authentication.td.com/uap-ui/index.html?consumer=easyweb&locale=en_CA#/login/easyweb-getting-started");
		
		driver.findElement(By.xpath("//*[@id=\"username100\"]")).sendKeys("t_w_o2plugs");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("twoplugs!123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/div[4]/div/div/button")).click();
		
	//	Webelement error=driver.fin//*[@id="error"]
		//driver.close();
     
	  
	  
  }
}
