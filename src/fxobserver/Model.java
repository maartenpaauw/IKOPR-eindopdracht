package fxobserver;

import java.util.ArrayList;

public class Model implements Subject
{
    private int x;

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public Model()
    {
        this.x = 1;
    }

    public Model(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void telOp()
    {
        this.x++;
    }

    @Override
    public void registerObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        this.observers.remove(this.observers.indexOf(observer));
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer: this.observers)
        {
            observer.update(this.x);
        }
    }
}
