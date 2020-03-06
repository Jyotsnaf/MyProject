package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Medical {
	
	private static final By By = null;

	@SuppressWarnings("static-access")
	@Test
	public void createPatient( ) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.openemr.io/a/openemr");
		driver.findElement(By.name(("authUser"))).clear();
		driver.findElement(By.name(("authUser"))).sendKeys("admin");
		driver.findElement(By.id(("clearPass"))).clear();
		driver.findElement(By.id(("clearPass"))).sendKeys("pass");
		driver.findElement(By.className(("fa-sign-in"))).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(//*[@id="form_fname"])
		driver.findElement(By.xpath("/html/body/iframe[1])).click();"
		Thread.sleep(3000,);
		
			
		}
		
		
				private Object name(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
