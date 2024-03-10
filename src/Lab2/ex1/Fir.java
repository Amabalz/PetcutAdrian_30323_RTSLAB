package Lab2.ex1;

import java.util.Observable;

public class Fir extends Observable implements Runnable {
    int id;
    Window win;
    int processorLoad;

    Fir(int id ,int processorLoad, Window win) {
        this.id = id;
        this.processorLoad = processorLoad;
        this.win = win;
    }

    int c;

    int getC(){
        return c;
    }

    int getId() {
        return id;
    }

    @SuppressWarnings("deprecation")
    public void run() {
        c = 0;
        while(c<1000) {
            for (int j = 0; j < processorLoad; j++) {
                j++;
                j--;
            }
            c++;
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setChanged();
            notifyObservers();
        }
    }
}