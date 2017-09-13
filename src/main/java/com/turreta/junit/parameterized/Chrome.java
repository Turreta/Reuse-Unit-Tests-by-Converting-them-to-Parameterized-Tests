package com.turreta.junit.parameterized;

import java.util.Arrays;

public class Chrome implements WebBrowserInterface
{
	@Override public int browseTo(String... params)
	{
		System.out.println("Chrome - processing parameters: " + Arrays.toString(params));
		return 0; // OK status
	}
}
