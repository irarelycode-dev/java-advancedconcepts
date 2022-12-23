package threads;

public class ThreadExample {

    public static void sleep(long millis){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Thread:"+Thread.currentThread().getName()+" has been stopped");
        }
    }

    public static void main(String[] args) {
        Runnable runnable=()->{
            while(true){
                sleep(1000);
                System.out.println("Running...");
            }
        };

        Thread thread=new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(40000);
    }
}
