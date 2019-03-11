package day01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test
{
	@Test
	public void ttt()
	{
	System.setProperty("webdriver.firfox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	WebDriver driver=new FirefoxDriver();	
	String url="http://localhost:8080/mobile_mysql/index.jsp";
	   driver.get(url);
	}

}
