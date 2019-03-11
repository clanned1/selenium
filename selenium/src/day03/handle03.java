package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle03
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		chrome.get(url);
		Thread.sleep(1000);
		
		/*
		 * 1.切换到小页面中去
		 * 2.定位小页面中的内容
		 * 3.操作小页面中的元素
		 */
		//两种切换方式
		//1.括号中直接写iframe的id或name
		//chrome.switchTo().frame("aa");
		//2.第二种，索引
		//chrome.switchTo().frame(0);
		chrome.switchTo().frame(0);
		chrome.findElement(By.id("user")).sendKeys("135");
		/*
		 * 跳回主页面
		 * 第一种，逐级跳转：主页面-->iframe-->iframe
		 * chrome.switchTo().parentFrame();
		 * 第二种，直接跳转最外层
		 *chrome.switchTo().defaultContent();
		 */
		 chrome.switchTo().parentFrame();
		 chrome.findElement(By.id("user")).sendKeys("135");
	}
}
