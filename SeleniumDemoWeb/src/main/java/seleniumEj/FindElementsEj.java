package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEj {

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
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(5000);
		
		//FindElements
		List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
		System.out.println("Numero de Elementos " + firstLevelMenu.size()); //Metodo para ver el # de elementos en la lista
		String primerMenu = firstLevelMenu.get(0).getText();
		System.out.println(primerMenu);
		String segundoMenu = firstLevelMenu.get(1).getText();
		System.out.println(segundoMenu);
		
		for (int i = 0; i<firstLevelMenu.size(); i++) {
			System.out.println("Los Menus son: " + firstLevelMenu.get(i).getText());
		}
		
	}

}
