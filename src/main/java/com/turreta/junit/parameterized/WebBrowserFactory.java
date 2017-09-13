package com.turreta.junit.parameterized;

import java.util.Optional;

public class WebBrowserFactory
{
	public static Optional<WebBrowserInterface> createImpl(String param)
	{
		WebBrowserInterface tmp = null;

		if("firefox".equals(param))
		{
			tmp = new FireFox();
		}
		else if("ie".equals(param))
		{
			tmp = new InternetExplorer();
		}
		else if("chrome".equals(param))
		{
			tmp = new Chrome();
		}
		return Optional.ofNullable(tmp);
	}
}
