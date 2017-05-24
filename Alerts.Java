package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.javascripter.net/faq/alert.htm");
		driver.findElement(By.xpath("//input[@value='Try it now']")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys("sicubiasubciausb");		//to enter text in popup
		if(driver.switchTo().alert().getText().equals("Hello from JavaScript!"))
			driver.switchTo().alert().accept();   		// to accept or positive response
		else
			driver.switchTo().alert().dismiss();		// to give negative response
		
		
		driver.close();
		
	}

}
