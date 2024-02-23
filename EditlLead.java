package com.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditlLead {

	public static void main(static[] args) throws InterruptedException {

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

		// Create Lead
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		Thread.sleep(3000);

		// Entering the company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");

		// Entering the first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anushiya");

		// Entering the lastname

		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");

		// Entering firstname local using xpath

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("S");

		// Entering Department name using locator

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Medical");

		// Entering Description using locator

		driver.findElement(By.id("createLeadForm_description")).sendKeys("xyz");

		// Entering Email using locator
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anushiyaa802@gmail.com");

		// Entering state/province

		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select statedropdownoptions = new Select(stateDropdown);
		statedropdownoptions.selectByVisibleText("New York");

		// Submitting create lead

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		Thread.sleep(3000);

		// Click on Edit Button

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		// clearing Description using locator
		//
		// driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();

		// Sending anytext to important note

		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("anu");

		// clicking on the update button

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();


	}

}
