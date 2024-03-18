package weekly.homeassignments.march;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateTaskwithoutmandatory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		//op.addArguments("--headless");
		op.addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver(op);
		
		
		driver.get("https://login.salesforce.com/?_ga=2.1890353.1496642727.1710402974-1353206612.1707665100");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("aarthi@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("TestLeaf@2024");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(@class,'slds-icon')]")).click();
		driver.findElement(By.xpath("//button[@kx-scope='button']")).click();
		Thread.sleep(3000);
		//Thread.sleep(3000);
		driver.findElement(By.className("slds-input")).sendKeys("task");
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Task");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']//mark[1]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small')]")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Task.NewTask']")).click();

		Set<String> window =driver.getWindowHandles();
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[@title='Completed']")).click();
		driver.findElement(By.tagName("textarea")).sendKeys(" SALES FORCE Automation Using Selenium");
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[3]")).click();
		driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
	}

}
