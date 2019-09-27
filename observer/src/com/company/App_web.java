package com.company;

public class App_web extends Observer {
  private Sensor sensor;
  public App_web(Sensor _sensor){
    sensor = _sensor;
    sensor.insert(this);
  }

  @Override
  public void update(){
    System.out.println("La nueva temperatura es: " + sensor.getTemp());
  }
}
