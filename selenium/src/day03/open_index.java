package day03;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class open_index
{

	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//等待30s
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		chrome.get(url);
		WebElement a=chrome.findElement(By.className("over"));
		Actions ac=new Actions(chrome);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		String b=chrome.findElement(By.id("over")).getText();
		System.out.println(b);
/*		WebElement input=chrome.findElement(By.id("user"));
		Actions ac=new Actions(chrome);
		ac.contextClick().perform();//页面右击
		ac.contextClick(input).perform();//输入框右击
*/	}
}
