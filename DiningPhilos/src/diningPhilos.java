import java.util.concurrent.Semaphore;

public class diningPhilos{
    static Semaphore[] fork = new Semaphore[] { new Semaphore(1), new Semaphore(1), new Semaphore(1), new Semaphore(1)};

    static void philospher(int i) throws InterruptedException{
        do{
            fork[i].acquire();
            fork[(i+1)%4].acquire();
            // Eating
            fork[i].release();
            fork[(i+1)%4].release();
            // Thinking
        }while(true);
    }

    public static void main(String args[]){
        Thread p1 =  new Thread();
        p1.setName("Philospher 1");

        Thread p2 = new Thread();
        p2.setName("Philospher 2");

        Thread p3 = new Thread();
        p3.setName("Philospher 3");

        Thread p4 = new Thread();
        p4.setName("Philospher 4");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}