package com.dio.base;

import java.math.BigDecimal;

/**
 * Esse é um comentário em bloco para informar que esse atributo representa o código do pedido
 * Dúvidas entrar em contato
 * @author Rodrigo Pires
 * @version 1.0.0
 * @see java.math.BigDecimal
 * @since Release 1.0.0
 */
public class Order {

    // representa o código do pedido
    private final String code;
    private final BigDecimal totalValue;

    /**
     * Construtor da Classe
     *
     * @param code          Código do pedido
     * @param totalValue    Valor total do pedido
     */
    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula o valor total de acordo com o valor do pedido. Se o valor for maior que 100.00 uma taxa será cobrada
     *
     * @return                  Valor total do pedido com as taxas
     * @throws RuntimeException Se o valor do pedido for negativo
     */
    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido não pode ter valor negativo!");
        }
        if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }
}