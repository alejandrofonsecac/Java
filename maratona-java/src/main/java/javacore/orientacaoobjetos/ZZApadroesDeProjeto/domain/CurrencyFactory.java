package javacore.orientacaoobjetos.ZZApadroesDeProjeto.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch (country){
            case EUA: return new USDollar();
            case BRAZIL: return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
