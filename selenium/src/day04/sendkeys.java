package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendkeys
{
	@Test
	public void test() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//等待30s
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		chrome.get(url);
		WebElement s=chrome.findElement(By.id("selectWithMultipleEqualsMultiple"));
	
//		Robot r=new Robot();//定义Robot类
//		r.keyPress(KeyEvent.VK_CONTROL);//按下键盘ctrl键
//		r.keyPress(KeyEvent.VK_S);//按下键盘s键
//		r.keyRelease(KeyEvent.VK_S);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_F4);
//		r.keyRelease(KeyEvent.VK_F4);
//		r.keyRelease(KeyEvent.VK_ALT);
		
		
		List<WebElement> option=s.findElements(By.tagName("option"));
		Actions ac=new Actions(chrome);
		
		//s.sendKeys(Keys.CONTROL);
		ac.keyDown(Keys.CONTROL)
			.click(option.get(0))
			.click(option.get(2))
			.perform();
	}
}
