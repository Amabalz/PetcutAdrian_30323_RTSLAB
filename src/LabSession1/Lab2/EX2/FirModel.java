package LabSession1.Lab2.EX2;

import java.util.Observable;

public class FirModel extends Observable implements Runnable {
    private int id;
    private int c;
    private int procLoad;
    private int priority;
    private Thread thread;

    public FirModel(int id, int priority, int procLoad){
        this.id = id;
        this.procLoad = procLoad;
        this.priority = priority;
    }

    public void start(){
        if(this.thread == null){
            this.thread = new Thread(this);
            this.thread.setPriority(this.priority);
            this.thread.start();
        }
    }

    public void run(){
        this.c = 0;
        while(this.c < 1000){
            for (int j = 0; j < this.procLoad; j++) {
                j++;
                j--;
            }

            this.c++;
            this.setChanged();
            this.notifyObservers();

            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getId() {
        return this.id;
    }

    public int getC() {
        return this.c;
    }
}
