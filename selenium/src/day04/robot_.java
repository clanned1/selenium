package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot_
{
	@Test
	public void test() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//等待30s
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		chrome.get(url);
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_ALT);
		a.keyPress(KeyEvent.VK_A);
		a.keyRelease(KeyEvent.VK_A);
		a.keyRelease(KeyEvent.VK_ALT);
		a.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		Actions b=new Actions(chrome);
		b.click().perform();
		a.keyPress(KeyEvent.VK_ENTER);
		
	}
}
