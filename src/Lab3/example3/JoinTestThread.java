package Lab3.example3;

class JoinTestThread extends Thread{
    Thread t;
    private int sum = 0;
    private int number;
    JoinTestThread(String n, Thread t, int number){
        this.number = number;
        this.setName(n);
        this.t = t;
    }
    public void run() {
        System.out.println("Thread " + this.getName() + " has entered the run() method");
        try {
            if (t != null) {
                t.join();
            }
            System.out.println("Thread " + this.getName() + " executing operation.");
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    sum += i;
                }
            }
            Main.sum += sum;
            System.out.println(this.getName() + " sum is: " + sum);
            System.out.println("Sum + " + this.getName() + " sum is: " + Main.sum);
            System.out.println("Thread " + this.getName() + " has terminated operation.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

