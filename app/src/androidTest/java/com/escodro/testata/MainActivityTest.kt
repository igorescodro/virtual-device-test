package com.escodro.testata

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.escodro.testata", appContext.packageName)
    }

    @Test
    fun test_HelloWorldIsShownInHome() {
        launchActivity<MainActivity>()
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun test_Assert() {
        assert(true) // A dummy test to check what happens when a test fail. ;)
    }
}