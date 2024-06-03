package LabSession1.Lab2.EX3;

public class Exercise3 {

    public static final int noOfThreads = 3;
    public static final int noOfRetries = 3;
    public static void main(String[] args) {
        AppController appController = new AppController();
        appController.startApp();
    }
}