package javacore.orientacaoobjetos.ZZApadroesDeProjeto.test;

import javacore.orientacaoobjetos.ZZApadroesDeProjeto.domain.Country;
import javacore.orientacaoobjetos.ZZApadroesDeProjeto.domain.Currency;
import javacore.orientacaoobjetos.ZZApadroesDeProjeto.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
