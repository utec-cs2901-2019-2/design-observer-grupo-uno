package com.company;
import com.company.Observer;

import java.util.ArrayList;
import java.util.List;



public class Sensor{
    private List<Observer> observers = new ArrayList<Observer>();
    private int temp;

    Sensor() {

    }

    public int getTemp(){
        return temp;
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void setTemp(int _temp){
        this.temp = _temp;
        notifyObservers();
    }
    public void insert(Observer observer){
        observers.add(observer);
    }

}