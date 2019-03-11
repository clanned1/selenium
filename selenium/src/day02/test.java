package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test
{
	@Test
	public void tools() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		String url="file:///G:/A%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/index.html";
		chrome.get(url);
		WebElement input=chrome.findElement(By.id("user"));
		input.sendKeys("1");
		//chrome.findElement(By.className("baidu")).click();
		WebElement s=chrome.findElement(By.id("moreSelect"));//定位到下拉框
		Select 	s1=new Select(s);//声明下拉框元素
		s1.selectByIndex(1);//按索引来选择，从0开始
		//s1.selectByValue("oppe");//按value的值选择
		//s1.deselectByVisibleText("oppe");//通过下拉框可见值选择
		
		WebElement r1=chrome.findElement(By.className("Saab"));//定位单选框
		r1.click();//点击单选框
		System.out.println(r1.isSelected());//查看是否点击
		
		WebElement c1=chrome.findElement(By.name("checkbox1"));//定位复选框
		c1.click();//点击复选框
		WebElement c2=chrome.findElement(By.name("checkbox2"));
		c2.click();
		
		WebElement b1=chrome.findElement(By.name("buttonhtml"));
		System.out.println(b1.isEnabled());
		//assertTrue("false",b1.isEnabled());
		
		WebElement a1=chrome.findElement(By.className("alert"));
		a1.click();
		Alert alert=chrome.switchTo().alert();//从浏览器跳转到弹出框上面去
		Thread.sleep(1000);
		alert.accept();//点击确定
		
		WebElement co1=chrome.findElement(By.className("confirm"));
		co1.click();
		Thread.sleep(1000);
		Alert con=chrome.switchTo().alert();
		con.dismiss();
		con.accept();
		
		WebElement pro1=chrome.findElement(By.className("prompt"));
		pro1.click();
		Alert pro2=chrome.switchTo().alert();
		Thread.sleep(1000);
		pro2.sendKeys("hello");
		pro2.accept();
		pro2.accept();
		
		String Lu="G:\\A学习\\笔记1.docx";
		WebElement f1=chrome.findElement(By.id("load"));
		f1.sendKeys(Lu);
	}
}
