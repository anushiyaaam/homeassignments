package weekly.homeassignments.march;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateTask {

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
		driver.findElement(By.className("slds-input")).sendKeys("task");
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Task");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']//mark[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small')]")).click();
	
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		
		driver.findElement(By.xpath("//a[@class='select']")).click();
		
		driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		
		driver.findElement(By.xpath("(//button[@data-aura-class='uiButton forceActionButton'])[3]")).click();
		String textmsg=driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")).getText();
		System.out.println(textmsg);
		
	}

}
