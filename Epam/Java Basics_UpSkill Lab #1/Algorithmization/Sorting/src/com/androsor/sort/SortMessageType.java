package com.androsor.sort;

public enum SortMessageType {

    DEFAULT("Исходный массив с количеством элементов N = "),
    ASCENDING("Отсортированный массив по возрастанию"),
    DESCENDING("Отсортированный массив по убыванию");

    private final String type;

    SortMessageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
