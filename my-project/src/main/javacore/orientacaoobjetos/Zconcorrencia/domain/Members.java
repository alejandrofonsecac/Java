package javacore.orientacaoobjetos.Zconcorrencia.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members extends javacore.orientacaoobjetos.Ythread.domain.Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public int pendigEmail(){
        lock.lock();
        try {
            return emails.size();
        }finally {
            lock.unlock();
        }
    }

    public void addMembeEmail(String email){
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try {
            while (this.emails.isEmpty()){
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " não tem email disponivel na lista, entrando em modo de espera");
                condition.await();
            }
            return this.emails.poll();
        }finally {
            lock.unlock();
        }
    }

    public void close(){
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegando emails");
        }finally {
            lock.unlock();
        }
    }
}
