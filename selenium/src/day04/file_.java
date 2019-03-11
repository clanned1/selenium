package day04;



import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class file_
{
	@Test
	public void test() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		FileHandler f=new FileHandler();
		FileHandler.delete(new File("F://aaa"));
		//FileHandler.copy(new File("F://aaa"), new File("F://bbb"));
	}
}
