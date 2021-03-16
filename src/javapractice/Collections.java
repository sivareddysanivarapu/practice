package javapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		/*
		 * ArrayList<String> a = new ArrayList<String>();
		 * 
		 * a.add("siva");// add method adds the elements to the array a.add("reddy");
		 * a.add(2, "sam"); a.add(3, "s"); a.add("siva");// list accepts duplicates
		 * System.out.println(a.get(2)); a.remove(2); System.out.println(a); //
		 * a.clear();//it clears the values in the arraylist // System.out.println(a);
		 * System.out.println(a); System.out.println(a.size());
		 * System.out.println(a.contains("ser"));// it tells whether the arraylist
		 * contains the given string, if it // presents it returns true
		 * System.out.println(a.contains("reddy"));
		 * 
		 * a.indexOf("siva");// this method tells the index value of siva in array list
		 * System.out.println(a.indexOf("siva"));
		 * 
		 * 
		 */

		HashSet<Integer> h = new HashSet<Integer>();
		h.add(3);
		h.add(6);
		h.add(3);// by running this it doesnt again stored in set, set doesnt allow duplicates,
					// it stores randomly
		h.add(8);
		h.add(5);
		//System.out.println(h.contains(3));
		//System.out.println(h);
		Iterator<Integer> i=h.iterator();//it iterates every object in the set
		System.out.println(i.next());//it iterates to next index n the set
		i.next();
		System.out.println(i.hasNext());
		System.out.println(h);
		

	}

}
