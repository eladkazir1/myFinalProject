package tests;

import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.MainPage;

public class AppTest extends BaseTest {
	
	@BeforeClass
	public void setupLogin() {
		MainPage mp = new MainPage(driver);
//		mp.acceptCookies();
		mp.chooseLogin();
		LoginPage lp = new LoginPage(driver);
		lp.login("eladkazir@gmail.com", "Yofita1988");
		
	}

}
