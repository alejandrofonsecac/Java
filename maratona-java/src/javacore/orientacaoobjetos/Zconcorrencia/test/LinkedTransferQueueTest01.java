package javacore.orientacaoobjetos.Zconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue

        LinkedTransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("william"));
        System.out.println(tq.offer("william"));
        System.out.println(tq.offer("william", 10, TimeUnit.SECONDS));
        tq.put("Vini");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Vini");
        }
        System.out.println(tq.tryTransfer("Arthur", 3, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());//espera ate ter algo na lista e espera
        System.out.println(tq.remainingCapacity());
    }
}
