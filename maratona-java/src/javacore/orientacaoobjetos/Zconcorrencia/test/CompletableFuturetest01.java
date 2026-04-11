package javacore.orientacaoobjetos.Zconcorrencia.test;

import javacore.orientacaoobjetos.Zconcorrencia.service.StoreService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFuturetest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesSyncFuture(storeService);
        searchPricesSyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store1"));
        System.out.println(storeService.getPriceSync("Store2"));
        System.out.println(storeService.getPriceSync("Store3"));
        System.out.println(storeService.getPriceSync("Store4"));

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPricesSyncFuture(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPricecsAsyncFuture("Store1").get());
        System.out.println(storeService.getPricecsAsyncFuture("Store2").get());
        System.out.println(storeService.getPricecsAsyncFuture("Store3").get());
        System.out.println(storeService.getPricecsAsyncFuture("Store4").get());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }

    private static void searchPricesSyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPricecsAsyncCompletableFuture("Store1").join());
        System.out.println(storeService.getPricecsAsyncCompletableFuture("Store2").join());
        System.out.println(storeService.getPricecsAsyncCompletableFuture("Store3").join());
        System.out.println(storeService.getPricecsAsyncCompletableFuture("Store4").join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }
}
