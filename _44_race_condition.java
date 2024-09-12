// if we have no of threads using same data there is race condition and results will be different

class Counter{
    int counter;

    protected Counter(){
        this.counter = 0;
    }

    public void incr(){
        this.counter++;
    }
}

public class _44_race_condition {
    public static void main(String args[]){

        Counter c = new Counter();

        Runnable rn = () -> {
            for(int i = 0; i < 400; i++){
                c.incr();
            }
        };

        Thread tr = new Thread();
        tr.start();

        System.out.println(c.counter);

    }
}
