package week1.extrahomeworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateCase {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'slds-global-actions__task')]")).click();
		driver.findElement(By.xpath("//span[text()='New Case']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'default input')])[2]")).sendKeys("Anushiya");
		driver.findElement(By.className("select")).click();
		driver.findElement(By.xpath("//a[@title='Escalated']")).click();
		driver.findElement(By.xpath("//span[text()='Subject']/following::input")).sendKeys("dummy");
		driver.findElement(By.tagName("textarea")).click();
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--brand')]")).click();
		String text=driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")).getText();
		System.out.println(text);
	}		

}
