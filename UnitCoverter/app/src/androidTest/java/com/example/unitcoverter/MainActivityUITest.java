package com.example.unitcoverter;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static java.util.EnumSet.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.unitcoverter", appContext.getPackageName());
    }

    @Test
    public void should_not_enter_empty_fah() {
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.celcius_text)).check(matches(withText("")));
    }

    @Test
    public void can_enter_fahrenheit() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("F to C")).perform(click());
        onView(withId(R.id.fahrenheit_input)).perform(typeText("45"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.celcius_text)).check(matches(withText("ºF is equal to 7.22 ºC")));
    }

    @Test
    public void can_enter_pounds() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("lb to kg")).perform(click());
        onView(withId(R.id.fahrenheit_input)).perform(typeText("45"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.celcius_text)).check(matches(withText("lbs is equal to 20.41 kg")));
    }

    @Test
    public void can_enter_miles() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("mi to km")).perform(click());
        onView(withId(R.id.fahrenheit_input)).perform(typeText("45"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.celcius_text)).check(matches(withText("miles is equal to 72.42 km")));
    }
    @Test
    public void can_enter_ounces() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("oz to ml")).perform(click());
        onView(withId(R.id.fahrenheit_input)).perform(typeText("45"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.celcius_text)).check(matches(withText("ounces is equal to 1330.81 ml")));
    }
}