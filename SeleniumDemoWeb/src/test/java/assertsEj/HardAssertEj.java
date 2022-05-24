package assertsEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEj {
  @Test
  public void assertEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a, b);
  }
  @Test
  public void assertNotEquals(){
	  int a = 5;
	  int b = 10;
	  Assert.assertNotEquals(a, b);  
  }
  @Test
  public void assertTrue() {
	  int a = 9;
	  int b = 10;
	  Assert.assertTrue(a == b);
  }
  @Test
  public void verificarTituloDePagina() {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;//Obtiene path donde se localiza el driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Configurar ChromeDriver
		WebDriver driver = new ChromeDriver(); //Conexion  
		driver.get("https://opensource-demo.orangehrmlive.com/");//Abrir Browser
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		Assert.assertEquals(actualTitle, expectedTitle);

  }
}