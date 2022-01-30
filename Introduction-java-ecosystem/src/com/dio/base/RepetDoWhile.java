package com.dio.base;

public class RepetDoWhile {

        private final String code;
        private final int totalValue;

        private String [] items;

        public RepetDoWhile (String code, int totalValue) {
            this.code = code;
            this.totalValue = totalValue;
        }

        public void printItems() {
            int i = 0;

            do {
                System.out.println(items[i]);
                i++;
            }    while (i < items.length);
        }
}
