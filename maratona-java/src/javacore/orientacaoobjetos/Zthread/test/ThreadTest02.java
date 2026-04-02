package javacore.orientacaoobjetos.Zthread.test;

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        // Imprime o nome da thread atual
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c); // Usei print para não pular linha a cada caractere
            if (i % 100 == 0 && i != 0) {
                System.out.println();
            }

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();

    }
}