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
       // t2.start();
        //t1.start();


        // example 2 - Runnable

        Runnable t22 = ()->{
            try {
                System.out.println(Thread.currentThread().getName());
                for(int i=1;i<=10;i++){
                    System.out.println(Thread.currentThread().getName()+" :"+i*2);
                    Thread.sleep(100);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        };
        Thread thread22 = new Thread(t22);
        thread22.setName("Table");
        thread22.start();
    }
}
