package weekly.homeassignments.march;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class LoginSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//input[@name='first_name']").sendKeys("Anushiya");
		shadow.findElementByXPath("//input[@name='last_name']").sendKeys("Sri");
		shadow.findElementByXPath("//input[@name='email']").sendKeys("anushiya@shamlatech.com");
		shadow.findElementByXPath("//div[@class='select_container']").click();
		
		WebElement dropdown=shadow.findElementByXPath("//select[@id='select']");
		Select options=new Select(dropdown);
		options.selectByVisibleText("Developer");
		shadow.findElementByXPath("//input[@name='company']").sendKeys("Testleaf");
		shadow.findElementByXPath("//div[@class='select_container']").click();
		WebElement country= shadow.findElementByXPath("//select[@name='country']");
		Select countryoptions=new Select(country);
		countryoptions.selectByValue("IN");
		WebElement state=shadow.findElementByXPath("//select[@name='state']");
		Select stateoptions=new Select(state);
		stateoptions.selectByVisibleText("Tamil Nadu");
		shadow.findElementByXPath("//input[@name='postal_code']").sendKeys("625020");
		//shadow.findElementByXPath("//div[@class='input-container has-error']").clear();
		shadow.findElementByXPath("//input[@name='username']").sendKeys(" vineeth@testleaf.com");
		shadow.findElementByXPath("//input[@name='eula']").click();
        shadow.findElementByXPath("//dx-button[@class='submit-button']").click();
            
	}

}
