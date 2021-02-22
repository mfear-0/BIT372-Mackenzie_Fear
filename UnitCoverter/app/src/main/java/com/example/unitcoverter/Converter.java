package com.example.unitcoverter;

public class Converter {
    public static float toCelsius(float fah) {
        return (fah - 32) * 5/9;
    }
    public static float toKilos(float lbs) {
        return (float) (lbs * 0.45359237);
    }
    public static float toKm(float miles) {
        return (float) (miles * 1.60934);
    }
    public static float toMls(float oz) {
        return (float) (oz * 29.5735);
    }
}
