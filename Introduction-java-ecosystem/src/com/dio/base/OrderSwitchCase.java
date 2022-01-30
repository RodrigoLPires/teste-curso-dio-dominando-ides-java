package com.dio.base;

public class OrderSwitchCase {

    private final String code;
    private final int totalValue;

    public OrderSwitchCase (String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public double calculateFee() {
        switch (totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
    }
}
