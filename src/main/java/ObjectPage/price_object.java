package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BaseClass;

public class price_object extends BaseClass {

	public price_object()
	{
		PageFactory.initElements(driver,this);
	}
@FindBy(id="radiobutton_0")
private WebElement button;

@FindBy(id="continue")
private WebElement cont;

public WebElement getselect()
{
	return button;
}
public WebElement getcontinue()
{
	return cont;
}

}
