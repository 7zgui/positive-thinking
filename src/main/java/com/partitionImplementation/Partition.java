package com.partitionImplementation;

import com.partitionImplementation.exception.NullSizeException;
import com.partitionImplementation.exception.OutOfRangeException;

import java.util.AbstractList;
import java.util.ArrayList;
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

    /**
     * The function partition takes as parameters a list and the size of subElements divide on
     * @param list : list of elements
     * @param size : the size of the sub lists to divide on
     * @return returns a list of sub lists and the size
     */
    public static <U> Partition<U> partition(List<U> list, int size) {
        return new Partition<>(list, size);
    }

    /**
     * The function partition takes index as parameter
     * @param index : list of elements
     * @return returns a list of sub lists
     */
    @Override
    public List<U> get(int index) throws OutOfRangeException ,NullSizeException,NullPointerException {
        int start = index * size;
        int end = Math.min(start + size, list.size());
        if(start>end){
            throw new OutOfRangeException("index : "+index+" is out of the range of list : "+start+">"+end);
        }else if (size==0){
            throw new NullSizeException("Size can't equal to "+ size);
        }else{
            return new ArrayList<>(list.subList(start, end));

        }

    }

    /**
     * @return returns the number of sub lists
     */
    @Override
    public int size() {
        return (int) Math.ceil((double) list.size() / (double) size);
    }



}
