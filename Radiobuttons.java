package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0;i<count;i++){
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Milk")){
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			}
		}
		System.out.println(count);
	}

}
