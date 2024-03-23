package Lab3.example4;

public class ThreadGroupDemo {
    public static void main(String args[]) throws Exception {
        ThreadGroup tg = new ThreadGroup("Group of threads");
        ThreadEx fir1 = new ThreadEx(tg, "Thread #1", '*');
        ThreadEx fir2 = new ThreadEx(tg, "Thread #2", '@');
        ThreadEx fir3 = new ThreadEx(tg, "Thread #3", '$');
        fir1.start();
        fir2.start();
        fir3.start();
        Thread.sleep(1000);
        System.out.println(tg.activeCount() + " threads in group.");
        Thread thrds[] = new Thread[tg.activeCount()];
        tg.enumerate(thrds);
        for (Thread t : thrds) {
            System.out.println(t.getName());
        }
        fir1.stopThread();
        Thread.sleep(6000);
        System.out.println(tg.activeCount() + " threads in group.");
        tg.interrupt();
    }
}

