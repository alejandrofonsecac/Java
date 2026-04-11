package javacore.orientacaoobjetos.Zconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {

    private static final ExecutorService ex = Executors.newCachedThreadPool();

    private double priceGenerator(){
        System.out.printf("%s generanting price%n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown(){
        ex.shutdown();
    }

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricecsAsyncFuture(String storeName){
        System.out.printf("Getting prices sync for store%s%n", storeName);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPricecsAsyncCompletableFuture(String storeName){
        System.out.printf("Getting prices sync for store%s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    private static void getPricesSyncFuture(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        storeService.getPricecsAsyncFuture("Store1").get();
        storeService.getPricecsAsyncFuture("Store2").get();
        storeService.getPricecsAsyncFuture("Store3").get();
        storeService.getPricecsAsyncFuture("Store4").get();

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }

    private static void getPricesSyncCompletableFuture(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        storeService.getPricecsAsyncCompletableFuture("Store1").get();
        storeService.getPricecsAsyncCompletableFuture("Store2").get();
        storeService.getPricecsAsyncCompletableFuture("Store3").get();
        storeService.getPricecsAsyncCompletableFuture("Store4").get();

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
