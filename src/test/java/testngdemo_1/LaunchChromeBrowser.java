
  package testngdemo_1;
  
  import java.time.Duration;
  
  import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver; import org.testng.annotations.Test;
  
  import io.github.bonigarcia.wdm.WebDriverManager;
  
  public class LaunchChromeBrowser {
  
  @Test public void LaunchChromeBrowser() throws InterruptedException {
  WebDriverManager.chromedriver().setup(); WebDriver driver = new
  ChromeDriver(); driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://www.google.com/");
  System.out.println("Launching Chrome Browser"); Thread.sleep(3000);
  driver.navigate().to("https://www.selenium.dev/"); Thread.sleep(3000);
  driver.navigate().back(); Thread.sleep(3000); driver.quit();
  
  }
  
  }
 


