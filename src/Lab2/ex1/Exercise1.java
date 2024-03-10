package Lab2.ex1;

public class Exercise1 {
    private static final int noOfThreads=9;
    private static final int processorLoad=1000000;
    public static void main(String args[]){
        Window win = new Window(noOfThreads);
        for(int i = 0; i < noOfThreads; i++){
            Fir f = new Fir(i, processorLoad, win);
            f.addObserver(win);
            Thread t = new Thread(f);
            t.start();
        }
    }
}