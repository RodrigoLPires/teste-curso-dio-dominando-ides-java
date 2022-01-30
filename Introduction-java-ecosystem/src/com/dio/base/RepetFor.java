package com.dio.base;

public class RepetFor{

    private final String code;
    private final int totalValue;

    private String [] items;

    public RepetFor (String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItems() {
        for(int i = 0; 1 < items.length; i++){
            System.out.println(items[i]);
        }
    }
}