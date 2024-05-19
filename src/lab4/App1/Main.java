package lab4.App1;

public class Main {
    public static void main(String[] args) {
        Integer monitor1 = new Integer(1);
        Integer monitor2 = new Integer(1);
        new ExecutionThread(monitor1, null, 2, 4, 4).start();
        new ExecutionThread(monitor1, monitor2, 3, 6, 3).start();
        new ExecutionThread(null, monitor2, 2, 5, 5).start();
    }
}
