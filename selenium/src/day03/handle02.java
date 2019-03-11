package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle02
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/pop.html";
		chrome.get(url);
		Thread.sleep(1000);
		chrome.findElement(By.id("goo")).click();
		Thread.sleep(5000);
		Set<String>w=chrome.getWindowHandles();//获取当前页面所有句柄到变量w中
		for(String handle:w)//随机选择一个句柄
		{
			chrome.switchTo().window(handle);
			String title=chrome.getTitle();
			if("百度一下，你就知道".equals(title))//通过标题判断如果是想要的句柄就进行操作
			{
				chrome.findElement(By.id("kw")).sendKeys("135");
			}
		}
	}
}
