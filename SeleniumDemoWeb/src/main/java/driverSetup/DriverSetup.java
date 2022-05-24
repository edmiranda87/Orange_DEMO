package driverSetup;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver setupDriver() {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;//Obtiene path donde se localiza el driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Configurar ChromeDriver
		WebDriver driver = new ChromeDriver(); //Conexion  
		return driver;
		
	}

}
