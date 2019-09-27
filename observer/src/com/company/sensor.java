import java.util.ArrayList;
import java.util.list;


public class Sensor{
    private list<Observer> observers = new ArrayList<Observer>();
    private int temp;
    public int getTemp(){
        return temp;
    }
    public void notifyAll(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
    public void setTemp(int _temp){
        this.temp = _temp;
        notifyAll();
    }
     public void insert(Observer observer){
      observers.add(observer);		
   }

}