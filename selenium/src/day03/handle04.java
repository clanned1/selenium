package day03;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class handle04
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/main.html";
		chrome.get(url);
		File jietu=((TakesScreenshot)chrome).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(jietu,new File("F:/test.jpg"));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		Thread.sleep(1000);
		chrome.findElement(By.id("input1")).sendKeys("123");
		WebElement a=chrome.findElement(By.id("div1"));
		String t=a.getText();
		System.out.println(t);
	}
}
