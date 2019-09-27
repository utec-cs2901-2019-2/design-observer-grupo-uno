package com.company;

public class Main {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        new App_web(sensor);
        new App_movil(sensor);

        System.out.println("First temp change: 8");
        sensor.setTemp(8);
        System.out.println("First temp change: 15");
        sensor.setTemp(15);
    }
}
