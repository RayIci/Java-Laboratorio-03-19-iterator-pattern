package IteratorPattern;

import java.util.Collection;
import java.util.LinkedList;

public class Range implements Iterable<Integer> {

    private Collection<Integer> collection = new LinkedList<Integer>();

    // ranges from start (inclusive) to end (exclusive)
    public Range(int start, int end) {
    	if(start < end)
    	{
    		for(int i=start; i<end; i++)
    			collection.add(i);
    	}
    	else throw new IllegalArgumentException();
    }

    // ranges from 0 (inclusive) to end (exclusive)
    public Range(int end) {
    	this(0, end);
    }

    @Override
    public RangeIterator iterator() {
		return new RangeIterator(this.collection);
    }

}
