package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.MyWorkspacePage;

public class LoginTest extends BaseTest {

	@Test(description = "login with valid email & invalid password")
	public void tc01_loginFailed() {
		MainPage mp = new MainPage(driver);
//		mp.acceptCookies();
		mp.chooseLogin();
		LoginPage lp = new LoginPage(driver);
		lp.login("eladkazir@gmail.com", "12345678");
		String actual = lp.getErrMsg();
		String expected = "These credentials do not match our records.";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "login with invalid email & valid password")
	public void tc02_loginFailed() {
		LoginPage lp = new LoginPage(driver);
		lp.login("galit@gmail.com", "Yofita1988");
		String actual = lp.getErrMsg();
		String expected = "These credentials do not match our records.";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "login with invalid email & invalid password")
	public void tc03_loginFailed() {
		LoginPage lp = new LoginPage(driver);
		lp.login("galit@gmail.com", "12345678");
		String actual = lp.getErrMsg();
		String expected = "These credentials do not match our records.";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "login with valid email & valid password")
	public void tc04_login() {
		LoginPage lp = new LoginPage(driver);
		lp.login("eladkazir@gmail.com", "Yofita1988");
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeBlackFridayPopup();
		Assert.assertTrue(mwp.isProjectsPage());
	}

}
