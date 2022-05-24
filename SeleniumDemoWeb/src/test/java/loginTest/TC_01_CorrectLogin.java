package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_01_CorrectLogin {
  
  WebDriver driver = DriverSetup.setupDriver();
  
  
  //Login PageObject
  LoginPage login = new LoginPage(driver);
  
  @BeforeTest
  public void startWebDriver() {
	  driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
  }
    
  @Test
  public void TC_01() throws InterruptedException {
	  login.login(GlobalVariables.USDER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	  
	  
	  
  }
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
