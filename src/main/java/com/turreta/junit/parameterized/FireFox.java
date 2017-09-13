package com.turreta.junit.parameterized;

import java.util.Arrays;

public class FireFox implements WebBrowserInterface
{
	@Override
	public int browseTo(String... params)
	{
		System.out.println("FireFox - processing parameters: " + Arrays.toString(params));
		return 0; // OK status
	}
}
