package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicializamoslos WebElements con Pagefactory
											   //THIS es un keyword con el que estamos indicando
											   //que es la misma clase donde se inicializan los objetos
				
	}

	//Login PageObjects/WebELements
	@FindBy(id="txtUsername")
	private WebElement userNametxt;
	@FindBy(id="txtPassword")
	private WebElement passwordtxt;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	@FindBy(xpath ="//*[@id=\"spanMessage\"]")
	private WebElement errorMessage;
	
	public void login(String user, String password) {
		userNametxt.sendKeys(user);
		passwordtxt.sendKeys(password);
		btnLogin.click();
		
	}
	
	public boolean incorrectlogin(String user, String password) {
		userNametxt.sendKeys(user);
		passwordtxt.sendKeys(password);
		btnLogin.click();
		boolean msj = errorMessage.getText().contains("Invalid credentials");
		return msj;
		
	}	
	
}
