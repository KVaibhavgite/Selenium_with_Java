package handlingTheDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Vaibhav gite/Desktop/singleselectdropdown.html");
		
		Thread.sleep(4000);
		WebElement dropdownelement = 
				driver.findElement(By.id("lang"));
		Select sel = new Select(dropdownelement);
		 sel.selectByIndex(2);
		 
		 Thread.sleep(4000);
			WebElement dropdownelement1 = 
					driver.findElement(By.id("cars"));
			Select sel1 = new Select(dropdownelement1);
			 sel1.selectByIndex(2);
		
			 Thread.sleep(4000);
		driver.close();
	}

}
