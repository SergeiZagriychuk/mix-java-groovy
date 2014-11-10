package com.qaprosoft

import org.testng.Assert
import org.testng.annotations.Test

import com.qaprosoft.carina.core.foundation.UITest

class GroovyTest extends UITest {

    @Test
    public void testSomething() {
	driver.get("http://google.com");
	Assert.assertEquals(driver.getTitle(), "Google", "Title is not as expected");
    }
}