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
import org.openqa.selenium.interactions.Actions;
/*
 * 1.打开百度，对准输入框右键，截图
 */
public class lianxi
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="https://www.baidu.com/";
		chrome.get(url);
		WebElement input=chrome.findElement(By.id("kw"));
		Actions ac=new Actions(chrome);
		ac.contextClick(input).perform();
		File jietu=((TakesScreenshot)chrome).getScreenshotAs(OutputType.FILE);
		Thread.sleep(10000);
		try
		{
			FileUtils.copyFile(jietu,new File("F:/test.jpg"));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
