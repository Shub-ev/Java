package Threads;

// isAlive is used on a Thread to check it is still running or not

class RunnableClass implements Runnable {
    Thread t;
    String name;

    public RunnableClass(String ThreadName){
        this.name = ThreadName;
        t = new Thread(this, name);
        System.out.println("Child Thread " + name);
        t.start();       // this will instantly start thread as created
    }

    @Override
    public void run(){
        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Child Thread " + this.name + ": " + i);
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Exiting Child Thread! " + name);
    }
}

public class _06_isAlive_join {
    public static void main(String[] args) {
        RunnableClass rn1 = new RunnableClass("Demo1");
        RunnableClass rn2 = new RunnableClass("Demo2");
        RunnableClass rn3 = new RunnableClass("Demo3");

        // check if above threads are alive or not 
        System.out.println("Thread Main is Alive : " + Thread.currentThread().isAlive());
        System.out.println("Thread One is Alive : " + rn1.t.isAlive());
        System.out.println("Thread Two is Alive : " + rn2.t.isAlive());
        System.out.println("Thread Three is Alive : " + rn3.t.isAlive());
        

        Thread currThread = Thread.currentThread();
        System.out.println(currThread);

        try {
            System.out.println("Waiting for threads to finish");
            rn1.t.join();
            rn2.t.join();
            rn3.t.join();

            for(int i = 0; i < 5; i++){
                System.out.println("Main Thread I : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Exiting Main Thread!");
        // check if above threads are alive or not 
        System.out.println("Thread Main is Alive : " + Thread.currentThread().isAlive());
        System.out.println("Thread One is Alive : " + rn1.t.isAlive());
        System.out.println("Thread Two is Alive : " + rn2.t.isAlive());
        System.out.println("Thread Three is Alive : " + rn3.t.isAlive());
    }
}
