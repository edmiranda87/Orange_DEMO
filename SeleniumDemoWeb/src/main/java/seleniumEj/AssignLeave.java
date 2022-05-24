package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		//Click Assign Leave
		WebElement assignLeave = driver.findElement(By.className("quickLinkText"));
		assignLeave.click();
		Thread.sleep(3000);
		
		//Llenar el textbox de Employee Name
		WebElement employeeName = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		employeeName.sendKeys("Eduardo Miranda");
		Thread.sleep(3000);
		//employeeName.clear();
		
		
		//Verificar Elemento desplegado en la pagina
		boolean assignBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
		
		if (assignBtn) {
			System.out.println("El boton Assign esta desplegado");
		}
		
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		System.out.println(welcomeMsj);
		boolean userMsj = welcomeMsj.contains("Paul");
		if (userMsj) {
			System.out.println("El mensaje de welcome contiene el nombre de Paul");
		}else {
			System.out.println("El mensaje de welcome no contiene el nombre de Paul");
		}
		
		//Interactuar con dropdown
	    Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		oSelect.selectByVisibleText("US - FMLA");
		Thread.sleep(3000);
			
		//Cerrar el Navegador Web
		driver.quit();
		
	}

}
