package com.recursive;

public record Item(int price, int size)
        implements Comparable<Item> {

    @Override
    public int compareTo(Item item) {
        return Double.compare((double)
                item.price / item.size, (double) price / size);
    }
}
