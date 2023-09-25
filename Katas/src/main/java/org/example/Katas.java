package org.example;

public class Katas {


    public double fahrenheitToCelsius(double i) {
        return (i-32)/1.80;
    }

    public double celsiusToFahrenheit(double v) {
        return (v*1.80) +32;
    }

    public String convertToRoman(int number) {
        StringBuilder romanStringBuilder = new StringBuilder();
        if (number < 5) {
            romanStringBuilder.append("I".repeat(Math.max(0, number)));
        }
        return String.valueOf(romanStringBuilder);
    }
}
