package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import com.google.common.base.Function;

public class TestFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\srajasekharreddy\\Documents\\Selenium\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srajasekharreddy\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		  
		  wait.until((WebElement)-> driver.findElement(By.name("q")));
		  
		  WebElement foo = wait.until(new Function<WebDriver,WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
		 
		
		
	}

}
