package week3.day3.list;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		// Launch the chrome driver

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");

		// maximize window
		driver.manage().window().maximize();

		// implicity wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// searching bags
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);

		Thread.sleep(3000);

		// Selecting male in gender
		// driver.findElement(By.xpath("//input[@id='Men']/following-sibiling::label")).click();

		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();

		Thread.sleep(3000);

		// selecting fashion bags

		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		Thread.sleep(3000);

		// getting the no of items

		String noofItems = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();

		System.out.println(noofItems);

		// getting the brandname

		List<WebElement> brandname = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		List<String> brandsarray = new ArrayList<String>();
		for (WebElement brand : brandname) {
			brandsarray.add(brand.getText());

		}
		System.out.println(brandsarray);

		// getting price---Own try

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='price  ']//strong"));
		List<String> priceamount = new ArrayList<String>();
		for (WebElement priceamout : price) {
			priceamount.add(priceamout.getText());

		}

		System.out.print(priceamount);

		// getting bag list
		List<WebElement> bagnamelist = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bagname = new ArrayList<String>();
		for (WebElement bagnameElement : bagnamelist) {
			bagname.add(bagnameElement.getText());

		}
		System.out.println(bagname);
		System.out.println(bagname.size());

		driver.close();
	}

}
