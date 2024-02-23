package com.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(LowerToUpper[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// Selecting browsers

		WebElement browsers = driver.findElement(By.xpath("(//label[text()='Safari'])[1]"));
		browsers.click();
		// browsers.getAttribute(null)
		Thread.sleep(3000);

		// Selecting Places
		driver.findElement(By.xpath(
				"//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active']/following::label[text()='Bengaluru']"))
				.click();

		// Identifying radiobutton selected by default

		WebElement Identify = driver
				.findElement(By.xpath("//div[@class='ui-radiobutton ui-widget']/following::label[text()='Safari'][2]"));

		// WebElement
		// identify=driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		System.out.println(Identify.getText());

		// select age group if not selected
		WebElement ageGroup = driver.findElement(
				By.xpath("//div[@class='ui-radiobutton ui-widget']/following::label[text()='21-40 Years']"));

		if (!ageGroup.isSelected()) {

		} else {

			System.out.println("It is already selected");
		}

	}

}
