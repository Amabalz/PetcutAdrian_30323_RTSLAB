package lab6.app2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args){
        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();

        CountDownLatch c = new CountDownLatch(3);

        new ExecutionThread(l1, c, 4, 2, 4).start();
        new ExecutionThreadM(l1, l2, c, 3, 3, 6).start();
        new ExecutionThread(l2, c,5, 2, 5).start();
    }
}
