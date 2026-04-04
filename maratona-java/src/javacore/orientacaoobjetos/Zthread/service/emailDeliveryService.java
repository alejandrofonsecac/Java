package javacore.orientacaoobjetos.Zthread.service;

import javacore.orientacaoobjetos.Zthread.domain.Members;

public class emailDeliveryService implements Runnable{
    private final Members members;

    public emailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver email...");
        while (members.isOpen() || members.pendigEmail() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviando email para " + email);
                Thread.sleep(3000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os email foram enviados com sucesso");
    }
}
