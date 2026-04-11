package javacore.orientacaoobjetos.Ythread.test;

import javacore.orientacaoobjetos.Ythread.domain.Accont;

public class ThreadAccountTest01 implements Runnable {
    private final Accont accont = new Accont();
    private String getThreadName;

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Vinicius");
        Thread t2 = new Thread(threadAccountTest01, "Fransisco");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (accont.getBalance() < 0) {
                System.out.println("FODEU");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        System.out.println(Thread.currentThread().getName() + " ######## fora do synchronized");
        synchronized (accont) {
            System.out.println(Thread.currentThread().getName() + " ****** dentro do synchronized");

            if (accont.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
                accont.withdrawal(amount);

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta: " + accont.getBalance());
            } else {
                System.out.println("Não possui saldo suficiente para: " + Thread.currentThread().getName() + " efetuar o saque " + accont.getBalance());
            }
        }
    }
}