package company;

public class App_movil extends Observer {
  private Sensor sensor;
  public App_movil(Sensor _sensor){
    sensor = _sensor;
  }
  @Override
  public void update(){
    System.printl("La nueva temperatura es: " + sensor.getTemp());
  }
}
