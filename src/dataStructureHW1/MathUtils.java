package dataStructureHW1;



import java.util.*;

public class MathUtils {
	public static int sum(ArrayList<Integer> list) {
	    int sum = 0;
	    for (int i: list) {
	        sum += i;
	    }
	    return sum;
	}
	    
	public static int product(ArrayList<Integer> list) {
		int product = 1;
		for (int i: list) {
			product *= i;
		}
		return product;
	}
	
	public static int largest(ArrayList<Integer> list) {
		int largest = Collections.max(list);
		return largest;
	}
	
	public static int smallest(ArrayList<Integer> list) {
		int smallest = Collections.min(list);
		return smallest;
	}
}
