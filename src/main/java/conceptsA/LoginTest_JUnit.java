package conceptsA;
//package concepts;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LoginTest_JUnit {
//
//	WebDriver driver;
//
//	@BeforeClass
//	public static void beforeClass() {
//		System.out.println("Before Class");
//	}
//
//	@AfterClass
//	public static void afterClass() {
//		System.out.println("After Class");
//	}
//
//	
//	
//	@Before
//	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.get("https://www.techfios.com/billing/?ng=admin/");
//		driver.manage().timeouts().implicitlyWait (10, TimeUnit.SECONDS);
//		
//
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//
//	}
//	
//	
//
//	@Test
//	public void logInTest() {
//
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		driver.findElement(By.id("password")).sendKeys("password");
//		driver.findElement(By.name("login")).click();
//		;
//
//	}
//
//	@Test
//	public void negLogInTest() {
//
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		driver.findElement(By.id("password1")).sendKeys("password");
//		driver.findElement(By.name("login")).click();
//		;
//
//	}
//
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//
//	}
//
//}
