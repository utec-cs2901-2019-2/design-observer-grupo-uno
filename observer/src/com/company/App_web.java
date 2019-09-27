package company;

public class App_web extends Observer {
  private Sensor sensor;
  public App_web(Sensor _sensor)
  {
    sensor = _sensor;
  }
  public void update()
  {
    System.printl("La nueva temperatura es: " + sensor.getTemp());
  }
}
