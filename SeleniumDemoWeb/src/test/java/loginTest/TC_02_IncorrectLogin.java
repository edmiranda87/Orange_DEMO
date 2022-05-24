package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_02_IncorrectLogin {
	
 //Declarar e inicializar un objeto del tipo WebDriver para usarlo en nuestra Test Class
 WebDriver driver = DriverSetup.setupDriver();
	  
 //Login PageObject
 LoginPage login = new LoginPage(driver);
	  
 @BeforeTest
 public void startWebDriver() {
     driver.get(GlobalVariables.HOME_PAGE);
	 driver.manage().window().maximize();
 }
	  
  @Test
  public void TC_02() {
	  boolean isTrue = login.incorrectlogin(GlobalVariables.USDER_ADMIN, "IncorrectPassword");	
	  Assert.assertTrue(isTrue);
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
