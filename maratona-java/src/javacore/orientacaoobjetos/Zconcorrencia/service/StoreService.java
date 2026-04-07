package javacore.orientacaoobjetos.Zconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {

    private static final ExecutorService ex = Executors.newCachedThreadPool();

    private double priceGenerator(){
        System.out.printf("%s generanting price%n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store%s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricecsAsync(String storeName){
        System.out.printf("Getting prices sync for store%s%n", storeName);
        Future<Double> submit = ex.submit(this::priceGenerator);
        ex.shutdown();
        return submit;
    }

    private static void searchPricesSyncFuture(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        storeService.getPricecsAsync("Store1").get();
        storeService.getPricecsAsync("Store2").get();
        storeService.getPricecsAsync("Store3").get();
        storeService.getPricecsAsync("Store4").get();

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
