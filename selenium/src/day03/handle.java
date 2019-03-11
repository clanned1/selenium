package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		chrome.get(url);
		String a=chrome.getWindowHandle();
		
		Thread.sleep(1000);
		chrome.findElement(By.className("open")).click();
		Set<String>w=chrome.getWindowHandles();//获取当前页面所有句柄到变量w中
		for(String handle:w)//随机选择一个句柄
		{
			chrome.switchTo().window(handle);
			String title=chrome.getTitle();
			if("UIAutomation iFrame".equals(title))//a通过标题判断如果是想要的句柄就进行操作
			{
					chrome.findElement(By.id("user")).sendKeys("135");
			}
		}
		chrome.switchTo().window(a);
		chrome.findElement(By.id("user")).sendKeys("135");
	}
}
