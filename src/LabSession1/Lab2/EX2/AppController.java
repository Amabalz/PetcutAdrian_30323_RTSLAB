package LabSession1.Lab2.EX2;

public class AppController {
    private FirModel firModel;
    private static WindowView windowView = new WindowView(Exercise2.noOfThreads);

    public void startApp(){
        for(int i = 0; i < Exercise2.noOfThreads; i++){
            this.firModel = new FirModel(i,i+2, Exercise2.procLoad);
            this.firModel.addObserver(windowView);
            this.firModel.start();
        }
    }
}
