package lab4.App2;

public class ExecutionThread extends Thread{
    Integer monitor1, monitor2;
    int waitMin, waitMax, activityMin, activityMax, sleep;
    public ExecutionThread(Integer monitor1, Integer monitor2, int waitMin, int waitMax, int activityMin, int activityMax, int sleep){
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.waitMin = waitMin;
        this.waitMax = waitMax;
        this.activityMin = activityMin;
        this.activityMax = activityMax;
        this.sleep = sleep;
    }

    public void task(int timeMin, int timeMax){
        int k = (int) Math.round(Math.random()*(timeMax - timeMin) + timeMin);
        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }
    }
    public void work(){
        System.out.println(this.getName() + " - STATE 2 - gathered monitor");
        int k = (int) Math.round(Math.random()*(activityMax - activityMin) + activityMin);
        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }
        try{
            Thread.sleep(1000 * sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " - STATE 3 - released monitor");
    }


    public void run(){
        System.out.println(this.getName() + " - STATE 1");
        task(waitMin, waitMax);
        synchronized (monitor1){
            System.out.println(this.getName() + " - STATE 2 - gathered first monitor");
            task(activityMin, activityMax);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.getName() + " - STATE 2 - released first monitor");
        }
        synchronized (monitor2){
            System.out.println(this.getName() + " - STATE 3 - gathered second monitor");
            try{
                Thread.sleep(1000*sleep);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.getName() + " - STATE 3 - released second monitor");
        }
        System.out.println(this.getName() + " - STATE 4 - finished");
    }
}
