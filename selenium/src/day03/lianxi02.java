package day03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//  2.打开百度，鼠标移动到更多产品，点击任意一个链接
public class lianxi02
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="https://www.baidu.com/";
		chrome.get(url);
		WebElement gd=chrome.findElement(By.name("tj_briicon"));
		Actions ac=new Actions(chrome);
		ac.moveToElement(gd).perform();
		Thread.sleep(1000);
		chrome.findElement(By.name("tj_nuomi")).click();
		
	}
}
