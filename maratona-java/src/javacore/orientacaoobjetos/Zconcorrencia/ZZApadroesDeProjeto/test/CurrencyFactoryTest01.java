package javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.test;

import javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.domain.Country;
import javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.domain.Currency;
import javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
