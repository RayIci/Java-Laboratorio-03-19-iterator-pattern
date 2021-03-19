package IteratorPattern;

import java.util.Iterator;
import java.util.Collection;

class RangeIterator implements Iterator<Integer> {

	private int indexOffset = 0;
	private Collection<Integer> collection;
	
	protected RangeIterator(Collection<Integer> collection)
	{
		this.collection = collection;
	}
	
	
    @Override
    public boolean hasNext() {
    	this.indexOffset++;
    	return (this.indexOffset - 1 >= this.collection.size()) ? false : true;
    }

    @Override
    public Integer next() {
    	return (Integer) this.collection.toArray()[this.indexOffset - 1];
    }

}
