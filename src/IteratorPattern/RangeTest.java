package IteratorPattern;

public class RangeTest {
    public static void main(String[] args) {
		Range r = new Range(3);
	
		/* prints
		 * 0 0
		 * 0 1
		 * 0 2
		 * 1 0
		 * 1 1
		 * 1 2
		 * 2 0
		 * 2 1
		 * 2 2
		 */
		
		
		for (int x : r)
		    for (int y : r)
			System.out.println(x + " " + y);
	    
		/* Ricostruisco uatilizzando while */
		RangeIterator i_iterator;
		RangeIterator j_iterator;
		
		System.out.println("");
		System.out.println("Seconda iterazione utiliuzzando cicli while:");
		i_iterator = r.iterator();
		while(i_iterator.hasNext())
		{
			j_iterator = r.iterator();
			while(j_iterator.hasNext())
				System.out.println(i_iterator.next() + " " + j_iterator.next());
			i_iterator.next();
		}
    }
}
