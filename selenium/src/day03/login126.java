package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login126
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="https://www.126.com/"; 
		chrome.get(url);
		Thread.sleep(1000);
		Set<String>w=chrome.getWindowHandles();//获取当前页面所有句柄到变量w中
		for(String handle:w)//随机选择一个句柄
		{
			String title=chrome.getTitle();
			if("".equals(title))//通过标题判断如果是想要的句柄就进行操作
			{
					chrome.switchTo().window(handle);
					chrome.findElement(By.id("auto-id-1545008537538")).sendKeys("135");;
			}
		}
		WebElement email=chrome.findElement(By.name("email"));
		email.sendKeys(Keys.CONTROL,"v");
		WebElement password=chrome.findElement(By.name("password"));
		password.sendKeys("1357924680");
		chrome.findElement(By.id("dologin")).click();
	}
}
