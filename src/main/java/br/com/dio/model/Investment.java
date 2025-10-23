package br.com.dio.model;

public record Investment(
        long id,
        long tax,
        //long daysToRescue,
        long initialFunds
) {

    @Override
    public String toString() {
        return " {" +
                "Id:" + id +
                ", Taxa:" + tax + "%" +
                ", Investimento Inicial:" + (initialFunds / 100) + "," + (initialFunds % 100) +
                '}';
    }
}
