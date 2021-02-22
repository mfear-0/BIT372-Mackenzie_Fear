package com.example.unitcoverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConverterTest {
    @Test
    public void fahrenheit_conversion_isCorrect() {
        assertEquals(0.0, Converter.toCelsius(32),0.01);
    }
    @Test
    public void lbs_conversion_isCorrect() {
        assertEquals(45.36, Converter.toKilos(100),0.01);
    }
    @Test
    public void miles_conversion_isCorrect() {
        assertEquals(72.42, Converter.toKm(45),0.01);
    }
    @Test
    public void oz_conversion_isCorrect() {
        assertEquals(1330.81, Converter.toMls(45),0.01);
    }
}