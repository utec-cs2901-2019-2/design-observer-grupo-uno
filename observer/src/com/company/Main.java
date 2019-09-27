package com.company;



public class Main {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        App_web cochino = new App_web(sensor);
        App_movil movil = new App_movil(sensor);
        
        System.out.println("First temp change: 8");
        sensor.setTemp(8);

        sensor.notifyObservers();

        System.out.println("First temp change: 15");
        sensor.setTemp(15);


        sensor.notifyObservers();
    }
}
