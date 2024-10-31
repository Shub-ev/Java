package Threads;

// Threads can be created using 2 ways

// 1. Implement Runnable Interface
// 2. Extend Thread class

class RunnableClass implements Runnable{
    Thread t;

    public RunnableClass() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start();
    }

    @Override
    public void run(){
        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Child Thread I : " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Exiting Child Thread!");
    }
}

public class _03_Runnable_Thread {
    public static void main(String[] args) {
        new RunnableClass();

        Thread currThread = Thread.currentThread();
        System.out.println(currThread);

        try {
            for(int i = 0; i < 5; i++){
                System.out.println("Main Thread I : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Exiting Main Thread!");

    }
}
