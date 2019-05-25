package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.Base;
import Util.Util;
public class Page4 extends Base{

//4.Positive Login with Dynamic Xpath	
	public void launchWebsite() {driver.get(prop.getProperty("urlMain"));
	driver.manage().timeouts().pageLoadTimeout(Util.pageLoadWait, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait (Util.implicitWait, TimeUnit.SECONDS);}
	
	public void correctLogin() {
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("//*[@id='login-submit']//preceding::input[4]")).sendKeys("michael.minhtf@gmail.com");
		driver.findElement(By.xpath("//*[@id='login-submit']//preceding::input[3]")).sendKeys("michael123#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
	public boolean verifyLogin() {
		return driver.findElement(By.xpath("//h3[text()='My Verizon Dashboard']")).isDisplayed();}
}
	
