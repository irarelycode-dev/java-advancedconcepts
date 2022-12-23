package threads;

public class ThreadExample2 {

    public static void sleep(long milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnable runnable=()->{
            for(int i=0;i<5;i++){
                sleep(1000);
                System.out.println("Running");
            }
        };

        Thread thread=new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
