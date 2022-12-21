package threads;

public class ThreadsStartStop {

    public static class MyThread extends Thread{
        public void run(){
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }

    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("MyRunnable running");
            System.out.println("MyRunnable finished");
        }
    }

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        Thread thread2=new Thread(new MyRunnable());

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("annoymous runnable started");
                System.out.println("anonymous runnable stopped");
            }
        };

        Runnable runnableR=()->{
            System.out.println("lambda running");
            System.out.println("lambda stopped");
        };

        Thread thread3=new Thread(runnable);
        Thread thread4=new Thread(runnableR);


        thread2.start();
        thread3.start();
        thread4.start();
    }

}
