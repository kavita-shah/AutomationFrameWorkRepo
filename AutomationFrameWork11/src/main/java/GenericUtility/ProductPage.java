package GenericUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	@FindBy(xpath="//input[@alt='Create product...']")
	private WebElement craeteProductImgBtn;

	public WebElement getCraeteProductImgBtn() {
		return craeteProductImgBtn;
	}

	
	
}
