package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		System.out.println("Test");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;//setting path for driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //identifying .exe for driver
		WebDriver driver = new ChromeDriver(); //Connecting  
		driver.get("https://sieena.sharepoint.com/SitePages/Inicio.aspx");//Open Browser
	}

}
