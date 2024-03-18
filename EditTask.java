package weekly.homeassignments.march;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class EditTask {

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
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//convert set in to list
		
		List<String> window=new ArrayList<String>(windowHandles); 
		
		//switch to child window
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(6000);

		WebElement js = driver.findElement(By.xpath("//a[@title='Tasks']"));
		
		//java script
		driver.executeScript("arguments[0].click()", js);
		
		
		//javascript Exception
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--reset')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[3]")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'slds-grid slds-grid--vertical-align-center')]")).click();
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("(//li[@data-aura-class='uiMenuItem']//a)[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@part='input'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='slds-is-today']//span[1]")).click();
		
		driver.findElement(By.xpath("(//a[@class='select'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[3]")).click();
		
		String verifymessage=driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")).getText();
		System.out.println(verifymessage);
	}

}
