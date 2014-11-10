package com.qaprosoft;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.UITest;

public class JavaTest extends UITest
{
    @Test
    public void testGoogleSuccess()
    {
	driver.get("http://google.com");
	Assert.assertEquals(driver.getTitle(), "Google", "Title is not as expected");
    }
}
