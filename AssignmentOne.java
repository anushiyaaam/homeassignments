package com.homeassignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOne {

	public static void main(LowerToUpper[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement basicCheckBox = driver
				.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']"));
		basicCheckBox.click();

		boolean isAlertOpen = driver.findElements(By.xpath("//div[@class='ui-growl-item']")).size() != 0;
		System.out.println(isAlertOpen);

		WebElement notificationCB = driver
				.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		notificationCB.click();

		Thread.sleep(1000);
		isAlertOpen = driver.findElements(By.xpath("//div[@class='ui-growl-item']")).size() != 0;
		if (isAlertOpen) {
			WebElement alertMessage = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
			System.out.println(alertMessage.getText());
		}

		Thread.sleep(5000);
		notificationCB.click();
		Thread.sleep(1000);

		isAlertOpen = driver.findElements(By.xpath("//div[@class='ui-growl-item']")).size() != 0;
		System.out.println(isAlertOpen);
		if (isAlertOpen) {
			WebElement alertMessage = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
			System.out.println(alertMessage.getText());
		}

		WebElement javaCB = driver.findElement(By.xpath("//label[text()='Java']"));
		javaCB.click();

		WebElement pythonCB = driver.findElement(By.xpath("//label[text()='Python']"));
		pythonCB.click();

		// Tristate checkbox

     WebElement tristatecheckbox=driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']//parent::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
     tristatecheckbox.click();
     System.out.println("State of the value is 0");
   
     for (int i=0;i<=3;i++) {
     
     if(tristatecheckbox.isSelected()) {
    	 System.out.println("State of the value is 1");
    	 
     }
     System.out.println("State of the value is2");
     }
       
      
       
		
	
		// Enable Toggle switch
		WebElement toggle = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggle.click();

		// Verify the checkbox is disabled
		WebElement checkboxDisable = driver
				.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']"));
		if (checkboxDisable.isSelected()) {
			System.out.println("It is  clicked");
		} else {
			System.out.println("It is not clicked");

		}

		// Select Multiple options

		WebElement multipleOptions = driver.findElement(By.xpath(
				"//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']"));
		multipleOptions.click();

		// Select all options

		WebElement allOptions = driver
				.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']//parent::div"));
		allOptions.click();
		// driver.close();

		/*
		 * WebElement miami=driver.findElement(By.
		 * xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']//parent::div[1]"
		 * )); miami.click();
		 */

		/*
		 * Select dropDown=new Select(multipleOptions);
		 * dropDown.selectByVisibleTssext("Miami");
		 */

		// driver.close();

	}}
     

