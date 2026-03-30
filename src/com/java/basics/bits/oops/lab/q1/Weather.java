package com.java.basics.bits.oops.lab.q1;

/*
question 1: 
Define a class, describe its constructor and instantiate its objects.
Also implement constructor overloading in the class.
*/
public class Weather {
    private float temperature;
    private float windSpeed;
    private short uvIndex;
    private String windDirection;
    public Weather () {
        System.out.println("Weather reports: ");
    }

    public Weather (float windSpeed, String windDirection) {
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        System.out.println("wind speed: "+ this.windSpeed+" km/h");
        System.out.println("wind direction: "+ this.windDirection);
    }

    public Weather (float temperature, short uvIndex){
        this.temperature = temperature;
        this.uvIndex = uvIndex;
        System.out.println("temperature: "+ this.temperature+"°C");
        System.out.println("UV Index: "+ this.uvIndex);
    }
    public static void main(String[] args) {
        new Weather();
        new Weather(32.4f, (short) 9);
        new Weather(43f, "N");
    }
}
