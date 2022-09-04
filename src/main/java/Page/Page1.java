package Page;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page1 extends RandomName {

	WebDriver driver;

	public Page1(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_BOX9_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement ADD_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_BOX10_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_BOX11_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='on']")
	WebElement TOGGLE_ALL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='on']")
	WebElement TOGGLE_RECLICK_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")
	WebElement CHOOSE_ONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON_ELEMENT;

	public void addData() {

		ADD_BOX9_ELEMENT.sendKeys("Aasif_Rasheed" + generateRandomNo(999));
		ADD_BUTTON_ELEMENT.click();
		ADD_BOX10_ELEMENT.sendKeys("Aasif_Rasheed" + generateRandomNo(999));
		ADD_BUTTON_ELEMENT.click();
		ADD_BOX11_ELEMENT.sendKeys("Aasif_Rasheed" + generateRandomNo(999));
		ADD_BUTTON_ELEMENT.click();

		TOGGLE_ALL_ELEMENT.click();
		Assert.assertEquals("Toggle All Checked", "Toggle All Checked");

	}

	public void addData2() {

		CHOOSE_ONE_ELEMENT.click();
		REMOVE_BUTTON_ELEMENT.click();
		Assert.assertEquals("One item removed ", "One item removed");
	}

	public void addData3() {

		TOGGLE_ALL_ELEMENT.click();
		REMOVE_BUTTON_ELEMENT.click();
		Assert.assertEquals("All items Removed", "All items Removed");
	}

}
