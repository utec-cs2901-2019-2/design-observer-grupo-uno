package com.company;

public class Main {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        new App_web(sensor);
        new App_movil(sensor);

        sensor.setTemp(8);
        sensor.update();
    }
}
