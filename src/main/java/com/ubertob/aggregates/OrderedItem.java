package com.ubertob.aggregates;

public primitive class OrderedItem {
    final int id;
    final String desc;
    final int quantity;
    final double price;

    public OrderedItem(int id, String desc, int quantity, double price) {
        this.id = id;
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }
}
