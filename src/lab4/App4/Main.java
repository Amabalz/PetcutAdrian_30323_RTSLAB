package lab4.App4;

public class Main {
    public static void main(String[] args) {
        Threads thread1 = new Threads(true, 2, 3, 7);
        Threads thread2 = new Threads(3, 5);
        Threads thread3 = new Threads(4, 6);
        thread1.start();
        thread2.start();
        thread3.start();
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All threads have finished working");
    }
}
