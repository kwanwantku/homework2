package homework2;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		if(list.size() <= 1) 
			return list;
		else if(list.get(0) == list.get(1)) {
			list.remove(0);
			unique(list);
		}
		else 
			unique(list.subList(1, list.size()));
		return list;
	}
	
	/**
	 * The old fibonacci.
	 * @param n is the number that want to find fibonacci number.
	 * @return fibonacci number
	 */
	public static long fibonacci(int n) {
	    // the base case
	    if (n < 2) return 1;
	    // the recursive step
	    return fibonacci(n-1) + fibonacci(n-2);
	}
	
	/**
	 * The method to find fibonacci and faster.
	 * @param n is the number that want to find fibonacci number.
	 * @return the fibonacci number
	 */
	public static long fibonacci2(int n) {
		return fibonacciHelper(n,0,1);
	}
	
	/**
	 * The helper to help to find fibonacci number
	 * @param n is the number of fibonacci that want to find.
	 * @param a is the first number to find
	 * @param b is the second number that want to find.
	 * @return the fibonacci number.
	 */
	public static long fibonacciHelper(int n, int a, int b) {
		if (n == 0) return 1;
		else if (n == 1) return a+b;
		return fibonacciHelper(n-1,b,a+b);
		
	}
	
	/**
	 * The method for testing methods.
	 * @param args are the argument that you want to test.
	 */
	public static void main (String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		System.out.println(unique(list));
		System.out.println();
		System.out.println("Normal : "+fibonacci(50));
		System.out.println("Faster : "+fibonacci2(50));
	}

}
