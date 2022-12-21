package threads;

public class CurrentThread {
    public static void main(String[] args) {
        Runnable runnable=()->{
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName+" running");

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(threadName+" finished");

        };
        Thread thread=new Thread(runnable,"thread1");
        Thread thread2=new Thread(runnable,"thread2");
        thread.start();
        thread2.start();
    }
}
