package Lab3.example3;

public class Main {
    public static int sum = 0;
    public static void main(String[] args){
        JoinTestThread w1 = new JoinTestThread("Thread 1", null, 60000);
        JoinTestThread w2 = new JoinTestThread("Thread 2", w1, 35000);
        w1.start();
        w2.start();
    }
}

