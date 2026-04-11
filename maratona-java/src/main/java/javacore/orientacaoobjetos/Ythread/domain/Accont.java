package javacore.orientacaoobjetos.Ythread.domain;

public class Accont {
    private int balance = 50;

    public void withdrawal(int amount){
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
