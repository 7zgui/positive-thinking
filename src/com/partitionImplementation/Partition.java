package com.partitionImplementation;

import java.util.AbstractList;
import java.util.List;

/**
 * @author Mohamed ouokki on 9/15/22
 * @project positive-thinking
 */
public class Partition<U> extends AbstractList<List<U>> {

    private final List<U> list;
    private final int size;

    private Partition(List<U> list, int size) {
        this.list = list;
        this.size = size;
    }

    public static <U> Partition<U> partition(List<U> list, int size) {
        return new Partition<>(list, size);
    }

    @Override
    public List<U> get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
