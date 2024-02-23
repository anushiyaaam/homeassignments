package com.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

    public static void main(LowerToUpper[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();

        // Clicking the button

        driver.findElement(By.xpath("//span[text()='Click']")).click();

        Thread.sleep(3000);

        // Getting the title

        LowerToUpper title = driver.getTitle();
        System.out.println(title);

        // Verifying the ttle

        if (title.contains("Dashboard")) {
            System.out.println("It is verified");
        }
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://leafground.com/button.xhtml");

        // Checking whether button
        // WebElement
        // buttonAction=driver.findElement(By.xpath("//button[@class='ui-button
        // ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2'"));

        WebElement buttonDisable = driver.findElement(By.xpath(
                "//div[@class='card']//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));

        // Getting the value
        if (!buttonDisable.isEnabled()) {
			System.out.println("Button is disabled.");
        }
        // Check the location of the button

        WebElement postionSubmit = driver.findElement(By.xpath(
                "//div[@class='card']//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']"));
        System.out.println(postionSubmit.getLocation());

        // Checking the background color

        WebElement saveBackground = driver
                .findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save']"));
        LowerToUpper color = saveBackground.getCssValue("color");
        System.out.println(color);

        // Find the height and width of the button

        WebElement buttonHeightwidth = driver.findElement(By.xpath(
                "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));
        System.out.println(buttonHeightwidth.getSize());

    }
}
