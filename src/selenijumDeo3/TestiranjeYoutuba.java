package selenijumDeo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestiranjeYoutuba {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Jelenin Dellic\\\\chrome driver\\\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void testSearch() {
		driver.navigate().to("https://www.youtube.com/");
		
		Youtube.typeSong(driver);
		Youtube.pressSearch(driver);
		
		String current = driver.getCurrentUrl();
		String expected = Pesma.URL;
		
		Assert.assertEquals(current, expected);
	}
		
	
	@Test(priority = 2)
	public void testPlay() {
		
		driver.navigate().to(Pesma.URL);
		
		Pesma.playSong(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		
		Assert.assertEquals(current, expected);
	}
	
}
