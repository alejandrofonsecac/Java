package javacore.orientacaoobjetos.Zconcorrencia.test;

import javacore.orientacaoobjetos.Zconcorrencia.service.StoreService;

import java.util.concurrent.ExecutionException;

public class CompletableFuturetest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
        searchPricesSyncFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store1"));
        System.out.println(storeService.getPriceSync("Store2"));
        System.out.println(storeService.getPriceSync("Store3"));
        System.out.println(storeService.getPriceSync("Store4"));

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
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
}
