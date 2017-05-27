package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Formmethods {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://us.makemytrip.com/");
		driver.findElement(By.xpath(".//*[@id='trip_type']/label[2]")).click();
		System.out.println("Round trip");
		System.out.println(driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='trip_type']/label[3]")).click();
		System.out.println("multicity trip");
		System.out.println(driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='trip_type']/label[1]")).click();
		System.out.println("oneway trip");
		System.out.println(driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
		
		
		driver.close();
	}

}
