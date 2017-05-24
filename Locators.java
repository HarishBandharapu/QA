package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("xxxxxxxxxxxxx");
//		driver.findElement(By.className("inputText")).sendKeys("xxxxxxx@xxxx.xxx");
		driver.findElement(By.name("pass")).sendKeys("xxxxxxxxxxxx");
//		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
//		driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
//		List<WebElement> l1=(List<WebElement>) driver.findElement(By.tagName("a"));
//		System.out.println(l1.size());
		
		
		
	}

}
