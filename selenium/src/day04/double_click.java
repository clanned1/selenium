package day04;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * 进入网站
 * 双击红色方块
 * 拖动红色方块到字上
 */
public class double_click
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//等待30s
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/%E9%A1%B5%E9%9D%A2/dragAndDrop1.html";
		chrome.get(url);
		WebElement click=chrome.findElement(By.id("drag"));
		WebElement move=chrome.findElement(By.xpath("/html/body/input"));			
		Actions ac=new Actions(chrome);
	
		ac.clickAndHold(click)
			.moveToElement(move)
			.release(click)
			.perform();
		//ac.dragAndDropBy(click,-200,-30).perform();
		
	}
}
