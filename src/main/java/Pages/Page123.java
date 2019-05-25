package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.Base;
import Util.Util;
public class Page123 extends Base{	
	
//1.Launch website	
	public void launchWebsite() {driver.get(prop.getProperty("urlMain"));
	driver.manage().timeouts().pageLoadTimeout(Util.pageLoadWait, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait (Util.implicitWait, TimeUnit.SECONDS);}

//2.FAILED LOGIN, (locate iFrame first)
	public void failLogin() {
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total iframes = "+size);
		driver.switchTo().frame(0);	
		driver.findElement(By.id("IDToken1")).sendKeys("WRONG");
		driver.findElement(By.name("IDToken2")).sendKeys("WRONG");
		driver.findElement(By.id("login-submit")).click();
	}
	
//3.screenshot of Failed login (see base)
	public boolean verifyLogin() {
		return driver.findElement(By.id("bannererror")).isDisplayed();}
	
}

			



