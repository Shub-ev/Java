package Threads;

// Threads can be created using 2 ways

// 1. Implement Runnable Interface
// 2. Extend Thread class

class RunnableClass implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread I : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Exiting Child Thread!");
    }
}

public class _02_Runnable {
    public static void main(String[] args) {
        RunnableClass rn = new RunnableClass();

        // Runnable just creates class with methods supporting runnable ex. run 
        // it dosent provide start() method so at end we have to pass this to thread class
        Thread thr = new Thread(rn, "Runnable Thread!");

        thr.start();
    }
}
