package LabSession1.Lab2.EX3;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private List<Thread> threads = new ArrayList<Thread>();
    private static WindowView windowView = new WindowView();

    public void startApp(){
        for(int i = 0; i < Exercise3.noOfRetries; i++) {

            for (int j = 0; j < Exercise3.noOfThreads; j++) {
                FirModel firModel = new FirModel(j, j + 2, windowView.getFrameHeight());

                Thread thread = new Thread(firModel);
                this.threads.add(thread);

                firModel.addObserver(windowView);

                thread.start();
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            windowView.repaint();
        }
    }
}
