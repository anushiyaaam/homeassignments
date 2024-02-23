package com.homeassignments;

import java.time.Duration;
import java.time.temporal.TemporalUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLad {

	public static void main(LowerToUpper[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Username Arguments
		WebElement userName = driver.findElement(By.xpath("//input[@class='inputLogin']"));
		userName.sendKeys("demoSalesManager");

		// Password Arguments

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");

		// Submit Button
		
		driver.findElement(By.xpath("//input [@class='decorativeSubmit']")).click();

		// Create Leads
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Leads
		driver.findElement(By.xpath("//div[@class='x-panel-header']//a[text()='Leads']")).click();

		// Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();

		// Phone tab
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']//span[text()='Phone']")).click();

		// phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("91");

		// findleads submit
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();

		Thread.sleep(3000);

		// Finding first element
         String  firstID = driver
				.findElement(
						By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[contains(text(),'11')]"))
				.getText();
		System.out.println(firstID);

		// Selecting first element
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();

		Thread.sleep(3000);

		// clicking the delete button
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Delete']")).click();

		Thread.sleep(3000);

		// clicking the find leads again

		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();

		// Entering Capturing first lead ID
		driver.findElement(By.xpath("//div[@class='x-form-element']//input[@name='id']")).sendKeys(firstID);

		// Submitting Findleads again

		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();

	}

}
