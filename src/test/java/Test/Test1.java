package Test;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.Page1;
import initBrowser.browserPage;

public class Test1 {

	WebDriver driver;

	@Test
	@Order(1)

	public void Q1() {

		driver = browserPage.init();
		Page1 page1 = PageFactory.initElements(driver, Page1.class);
		page1.addData();

	}

	@Test
	@Order(2)
	public void Q2() {

		driver = browserPage.init();
		Page1 page1 = PageFactory.initElements(driver, Page1.class);
		page1.addData2();

	}

	@Test
	@Order(3)
	public void Q3() {

		driver = browserPage.init();
		Page1 page1 = PageFactory.initElements(driver, Page1.class);
		page1.addData3();

	}

}
