package com.company;

public class App_movil extends Observer {
  private Sensor sensor;
  public App_movil(Sensor _sensor)
  {
    sensor = _sensor;
    sensor.insert(this);
  }
  public void update()
  {
    System.out.println("La nueva temperatura es: " + sensor.getTemp());
  }
}
