package katas.multicurrency;

public class Bank{
    Money reduce(Expression expr, String currency){
        return expr.reduce(currency);
    }
}