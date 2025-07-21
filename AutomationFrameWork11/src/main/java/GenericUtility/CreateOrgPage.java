package GenericUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrgPage {
	@FindBy(name="//input[@alt='Create organization...']")
	private WebElement createContacredt;

	public WebElement getCreateContacredt() {
		return createContacredt;
	}
	
	
	

}
