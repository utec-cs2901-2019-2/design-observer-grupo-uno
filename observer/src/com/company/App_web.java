package company;

public class App_web extends Observer {
  private Sensor sensor;
  public void update()
  {
    System.printl("La nueva temperatura es: " + sensor.getTemp());
  }
}
