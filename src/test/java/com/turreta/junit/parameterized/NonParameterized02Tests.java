package com.turreta.junit.parameterized;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NonParameterized02Tests
{
	@Test
	public void testImpl01_usecase01()
	{
		Optional<WebBrowserInterface> optional = WebBrowserFactory.createImpl("ie");
		WebBrowserInterface tmp = optional.get();
		Assert.assertTrue(tmp.browseTo("data1", "data2", "data3") == 0);
	}

	@Test
	public void testImpl01_usecase02()
	{
		Optional<WebBrowserInterface> optional = WebBrowserFactory.createImpl("ie");
		WebBrowserInterface tmp = optional.get();
		Assert.assertTrue(tmp.browseTo("data4", "data5", "data6") == 0);
	}
}
