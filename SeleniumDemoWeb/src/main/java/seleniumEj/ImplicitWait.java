package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;//Obtiene path donde se localiza el driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Configurar ChromeDriver
		WebDriver driver = new ChromeDriver(); //Conexion  
		driver.get("https://opensource-demo.orangehrmlive.com/");//Abrir Browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit Wait
		WebElement userName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsernam")));
		
		//Declarando, Obteniendo WebElements y objetos de la pagina web
		//WebElement userName = driver.findElement(By.id("txtUsernam"));
		

	}

}
