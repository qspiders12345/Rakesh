package com.test.Actitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.Actitime.BaseTest;
import com.pom.Actitime.POMActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
}