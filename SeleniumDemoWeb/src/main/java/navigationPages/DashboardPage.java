package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//DashboardObjects
	@FindBy(id = "welcome")
	private WebElement WelcomeDrpDown;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement LogoutBtn;
	
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		WelcomeDrpDown.click();
		Thread.sleep(1000);
		LogoutBtn.click();
	}
	
}
