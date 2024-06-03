package LabSession1.Lab2.EX3;

import java.util.Observable;

public class FirModel extends Observable implements Runnable {
    private int id;
    private int yCoordinate;
    private int priority;
    private Thread thread;
    private int frameHeight;

    public FirModel(int id, int priority, int frameHeight){
        this.id = id;
        this.priority = priority;
        this.frameHeight = frameHeight;
    }

    public void run(){
        this.yCoordinate = 0;
        while(stop()) {

            this.yCoordinate++;
            this.setChanged();
            this.notifyObservers();

            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean stop(){
        if(this.yCoordinate + 50 >= this.frameHeight) return false;
        return true;
    }

    public int getId() {
        return this.id;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }
}
