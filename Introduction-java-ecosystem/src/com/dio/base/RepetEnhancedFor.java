package com.dio.base;

public class RepetEnhancedFor {

    private final String code;
    private final int totalValue;

    private String [] items;

    public RepetEnhancedFor (String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItems() {
        for(String i: items) {
            System.out.println(i);
        }
    }
}