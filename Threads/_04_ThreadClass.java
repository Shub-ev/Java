package Threads;

class ThreadClass extends Thread{

    public ThreadClass() {
        super("Demo Thread");
        System.out.println("Child Thread: "+this);
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

public class _04_ThreadClass {
    public static void main(String[] args) {
        Thread thr = new ThreadClass();

        System.out.println(thr);

        thr.start();

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
