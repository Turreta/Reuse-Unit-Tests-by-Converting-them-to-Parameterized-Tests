package com.turreta.junit.parameterized;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

@RunWith(Parameterized.class)
@SpringBootTest
public class ParameterizedAllTests
{
	/**
	 * List contains "firefox", "ie", and "chrome".
	 * It has to be public static.
 	 */
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"firefox" }, { "ie" }, {"chrome"}
		});
	}

	private String implN;

	// Our tests is now a "backhole" blackbox
	public ParameterizedAllTests(String implN)
	{
		this.implN = implN;
	}

	@Test
	public void testImpl01_usecase01()
	{
		Optional<WebBrowserInterface> optional = WebBrowserFactory.createImpl(this.implN);
		WebBrowserInterface tmp = optional.get();
		Assert.assertTrue(tmp.browseTo("data1", "data2", "data3") == 0);
	}

	@Test
	public void testImpl01_usecase02()
	{
		Optional<WebBrowserInterface> optional = WebBrowserFactory.createImpl(this.implN);
		WebBrowserInterface tmp = optional.get();
		Assert.assertTrue(tmp.browseTo("data4", "data5", "data6") == 0);
	}

}
