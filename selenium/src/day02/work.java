package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class work
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/autotest.html";
		chrome.get(url);
		WebElement user=chrome.findElement(By.id("accountID"));
		user.sendKeys("麻花藤");
		WebElement password=chrome.findElement(By.id("passwordID"));
		password.sendKeys("666");
		WebElement a1=chrome.findElement(By.id("areaID"));
		Select a2=new Select(a1);
		//a2.selectByIndex(2);
		a2.selectByValue("beijing");
		WebElement b2=chrome.findElement(By.id("sexID2"));
		b2.click();
		
		WebElement c1=chrome.findElement(By.id("u2"));
		c1.click();
		WebElement c2=chrome.findElement(By.id("u3"));
		c2.click();
		WebElement c3=chrome.findElement(By.id("u4"));
		c3.click();
		
		String Lu="G:\\A学习\\笔记1.docx";
		WebElement d1=chrome.findElement(By.name("file"));
		d1.sendKeys(Lu);
		
		WebElement e1=chrome.findElement(By.id("buttonID"));
		e1.click();
		Alert e2=chrome.switchTo().alert();
		e2.accept();
	}
}
