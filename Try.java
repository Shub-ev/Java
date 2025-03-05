class Try{
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());

        for(int i = 0; i < 100000; i++){
            System.out.println("Free Memory:" + r.freeMemory());
            Try t = new Try();
            t = null;
        }

        Thread.sleep(4000); 
    }
    public void finalize(){
        System.out.println("Try Object Destroyed : " + count++);
    }
}