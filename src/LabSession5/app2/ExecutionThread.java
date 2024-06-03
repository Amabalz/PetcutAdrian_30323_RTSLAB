package LabSession5.app2;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class ExecutionThread extends Thread{
    Lock l1,l2;
    CountDownLatch c;
    int sleep_time, activity_min, activity_max;
    public ExecutionThread(Lock l1, Lock l2, CountDownLatch c,int sleep_time, int activity_min, int activity_max) {
        this.l1 = l1;
        this.l2 = l2;
        this.c = c;
        this.sleep_time = sleep_time;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
    }

    public void run() {
        System.out.println(this.getName() + " - STATE 1");

        if(l1!=null)
        {
            this.l1.lock();
            System.out.println(this.getName() + "STATE 2");

            int k = (int)Math.round(Math.random()*(activity_max-activity_min)+activity_min);
            for(int i = 0;i<k*100000;i++)
            {
                i++;
                i--;
            }
            try {
                Thread.sleep(sleep_time*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            this.l1.unlock();
            System.out.println(this.getName() + "STATE 3");


        }
        else
            if(l1!= null && l2!=null)
            {
                this.l1.lock();
                this.l2.lock();

                System.out.println(this.getName() + "STATE 2");

                int k = (int)Math.round(Math.random()*(activity_max-activity_min)+activity_min);
                for(int i = 0;i<k*100000;i++)
                {
                    i++;
                    i--;
                }
                try {
                    Thread.sleep(sleep_time*1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                this.l1.unlock();
                this.l2.unlock();
                System.out.println(this.getName() + "STATE 3");

            }
            else if( l2!=null)
            {
                {

                    this.l2.lock();

                    System.out.println(this.getName() + "STATE 2");

                    int k = (int)Math.round(Math.random()*(activity_max-activity_min)+activity_min);
                    for(int i = 0;i<k*100000;i++)
                    {
                        i++;
                        i--;
                    }

                    try {
                        Thread.sleep(sleep_time*1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    this.l2.unlock();
                    System.out.println(this.getName() + "STATE 3");

                }
            }

        this.c.countDown();
        try {
           this. c.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
