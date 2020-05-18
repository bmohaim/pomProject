package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPackage {
WebDriver driver;
	
	public AddContactPackage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.ID, using = "username") WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_LOCATOR;
}
