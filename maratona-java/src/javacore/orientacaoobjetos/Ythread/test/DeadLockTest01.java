package javacore.orientacaoobjetos.Ythread.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        //Esse codigo abaixo resulta um deadlock
        //Para solve e apenas fazer com que no R1 o lock 1 realize primeiro depois o lock2. E no R2 o lock1 primeiro e depois loock 2

         // r1
         // r2  -> Deadloock
         // r2
         // r1

        // r1
        // r2  -> Deadloock resolvido
        // r1
        // r2

        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1: Segurarndo lock 1");
                System.out.println("Thread 1: Esperando lock 2");

                synchronized (lock2){
                    System.out.println("Thread 1: Segurando lock 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2){
                System.out.println("Thread 2: Segurarndo lock 2");
                System.out.println("Thread 2: Esperando lock 1");

                synchronized (lock1){
                    System.out.println("Thread 2: Segurando lock 1");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
