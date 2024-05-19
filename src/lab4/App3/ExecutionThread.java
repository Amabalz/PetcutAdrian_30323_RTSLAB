package lab4.App3;

public class ExecutionThread extends Thread{
    Integer monitor;
    int activityMin, activityMax, sleep;
    boolean isRunning = true;
    public ExecutionThread(Integer monitor, int activityMin, int activityMax, int sleep){
        this.monitor = monitor;
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

    public void run(){
        while(isRunning) {
            System.out.println(this.getName() + " STATE 0");
            synchronized (monitor){
                System.out.println(this.getName() + " STATE 1 - gathered monitor");
                task(activityMin, activityMax);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " STATE 2 - released monitor");
            }
            try{
                Thread.sleep(1000*sleep);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println((this.getName() + " STATE 3"));
        }
    }
}
