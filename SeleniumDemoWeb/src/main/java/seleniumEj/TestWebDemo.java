package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDemo {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;//Obtiene path donde se localiza el driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Configurar ChromeDriver
		WebDriver driver = new ChromeDriver(); //Conexion  
		driver.get("https://opensource-demo.orangehrmlive.com/");//Abrir Browser
		driver.manage().window().maximize();
		
		//Declarando, Obteniendo WebElements y objetos de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(5000);
		
		//Metodos del explorador
		String title = driver.getTitle();
		System.out.println("El titulo es:" + title);
		
		//Validacion Homepage
		String urlDashboard = driver.getCurrentUrl();
		boolean loginCorrect =  urlDashboard.contains("/dashboard");
		
		if(loginCorrect) {
			System.out.println("Login Correcto");
		}else {
			System.out.println("Login Incorrecto");
		}
		
		//Metodos Navegacion
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//Cerrar Navegador
		driver.close();
		
		
	}

}
