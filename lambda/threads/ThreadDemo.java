package lambda.threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        //example 1 Runnable
        Runnable thread1 = ()->{
            //thread body;
            for(int i=1;i<=10;i++){
                System.out.println("Value of i : "+Thread.currentThread().getName()+" :"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        Thread t1 = new Thread(thread1);
        t1.setName("Jhon-Wick");
        Thread t2 = new Thread(thread1);
        t2.setName("Captan America");
        t2.start();
        t1.start();
    }
}
