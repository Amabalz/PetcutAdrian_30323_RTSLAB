package LabSession1.Lab2.EX2;

public class Exercise2 {

    public static final int noOfThreads = 6;
    public static final int procLoad = 1000000;
    public static void main(String[] args) {
        AppController appController = new AppController();
        appController.startApp();
    }
}
