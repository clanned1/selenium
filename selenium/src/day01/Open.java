package day01;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Open
{
	@Test
	public void open() throws InterruptedException
	{
		//System.setProperty("webdriver.firfox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");//C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe
	//WebDriver driver=new FirefoxDriver();
	WebDriver chrome=new ChromeDriver();
	//打开网址
	String url="https://www.baidu.com";
	String url1="https://www.v2ex.com";
	String title;
	chrome.manage().window().maximize();	//浏览器最大化	

	chrome.get(url);//打开网址
	chrome.navigate().to(url1);//打开网址
	
	Dimension dimension = new Dimension(900, 800);
	chrome.manage().window().setSize(dimension);

	System.out.println(chrome.getCurrentUrl());// 获取当前页面url
	
	chrome.navigate().back();	//浏览器后退
	
	title=chrome.getTitle();//获取当前页面标题
	System.out.println(title);
	
	Thread.sleep(1000);//在当前页面停止1000毫秒
	
	chrome.navigate().forward();//浏览器前进

	}

}
