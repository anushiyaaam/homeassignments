package week1.extrahomeworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditCase {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='More']")).click();
		Thread.sleep(3000);
         WebElement js = driver.findElement(By.xpath("(//span[text()='Cases'])[2]"));
		
		//java script
		driver.executeScript("arguments[0].click()", js);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}		
}
