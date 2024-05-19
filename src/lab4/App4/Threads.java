package lab4.App4;

public class Threads extends Thread{
    boolean giver = false;
    int activityMin, activityMax, sleep;
    public Threads(boolean giver, int activityMin, int activityMax, int sleep){
        this.giver = giver;
        this.sleep = sleep;
        this.activityMin = activityMin;
        this.activityMax = activityMax;
    }
    public Threads(int activityMin, int activityMax){
        this.activityMax = activityMax;
        this.activityMin = activityMin;
    }

    public void task(int timeMin, int timeMax){
        int k = (int) Math.round(Math.random()*(timeMax - timeMin) + timeMin);
        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }
    }

    public void run(){
        if(giver){
            System.out.println(this.getName() + " STATE 0");
            try{
                Thread.sleep(1000*sleep);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.getName() + " STATE 1");
            task(activityMin, activityMax);
            System.out.println(this.getName() + " notify all");
            notifyAll();
            System.out.println(this.getName() + " STATE 2");
        } else {
            System.out.println(this.getName() + " STATE 0");
            try{
                wait();
                System.out.println(this.getName() + " STATE 1");
                task(activityMin, activityMax);
                System.out.println(this.getName() + " STATE 2");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
