package selenijumDeo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pesma {
	
	public static final String URL = "https://www.youtube.com/results?search_query=Rick+Astley+Never+gonna+give+you+up";
	private static final String SONG_XPATH = "//*[@id=\"video-title\"]/yt-formatted-string";
	
	public static void playSong(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SONG_XPATH));
		we.click();
	}
}
