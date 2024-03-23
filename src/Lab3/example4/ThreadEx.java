package Lab3.example4;

class ThreadEx extends Thread {
    boolean stop;
    char sign;
    ThreadEx(ThreadGroup tg, String name, char sign) {
        super(tg, name);
        this.sign = sign;
        stop = false;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " ON.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(sign);
                Thread.sleep(250);
                synchronized (this) {
                    if (stop) {
                        break;
                    }
                }
            }
        } catch (Exception exc) {
            System.out.println(Thread.currentThread().getName() + " interrupt.");
        }
        System.out.println(Thread.currentThread().getName() + " The end.");
    }

    public void stopThread() {
        stop = true;
    }
}
