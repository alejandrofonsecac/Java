package javacore.orientacaoobjetos.Zconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        // Programação assincrona e nao assincrona

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dolarRequest = executorService.submit(() -> {
                TimeUnit.SECONDS.sleep(2);
                return 4.35D;
        });
        System.out.println(doSomething());
        dolarRequest.get();
        Double dolarResponse = dolarRequest.get(3, TimeUnit.SECONDS);
        System.out.println("Dolar: " + dolarResponse);
        executorService.shutdown();
    }

    private static Long doSomething(){
        System.out.println(Thread.currentThread().getName());
        long  sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += 1;
        }
        return sum;
    }
}
