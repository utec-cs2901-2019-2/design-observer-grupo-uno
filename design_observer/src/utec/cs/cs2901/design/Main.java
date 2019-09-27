package utec.cs.cs2901.design;

public class Main {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        new App_web(sensor);
        new App_movil(sensor);

        sensor.update();
        sensor.update();
    }
}
