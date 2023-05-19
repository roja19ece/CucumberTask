package org.stepdef;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookClass {
	public static WebDriver driver;
	@Before
	public static void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void waitTime()
	{driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void clickMethod(WebElement element)
	{
		element.click();
	}
	/*public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}*/
	
	/*public static void actionsclass(WebElement element) {
		try {
		Actions action = new Actions (driver);
		action.click(element).perform();
		Thread.sleep(5000);
		}
		catch (InterruptedException e) {
		e.printStackTrace();
		}}*/
	public static void Scroll(WebElement element)
	{
    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void window(int num) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			Object[] handle2=windowHandles.toArray();
			String window = handle2[num].toString();
			driver.switchTo().window(window);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("window does not switch");
		}
	}
	
	public static void dropdown(WebElement element,String toSelect) {
		Select select = new Select(element);
		select.selectByVisibleText(toSelect);
	}

/*public static void close()
{
	driver.close();
}*/
	
}
