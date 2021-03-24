package dataStructureHW1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import dataStructureHW1.MathUtils;

public class Main {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			input.useDelimiter("\\n");
			
			//list of numbers
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			System.out.println("Please type 5 numbers below, one per line: ");
			for (int i = 1; i <= 5; i++) {
				numbers.add (input.nextInt());
			}
			
			//print sum, product, max and min
			int sum = MathUtils.sum(numbers);
			System.out.println("sum = " + sum);
			
			int product = MathUtils.product(numbers);
			System.out.println("product = " + product);
			
			int largest = MathUtils.largest(numbers);
			System.out.println("Largest = " + largest);
			
			int smallest = MathUtils.smallest(numbers);
			System.out.println("Smallest = " + smallest);
			
			//create hash map of vehicles
			HashMap<String, String> carsHashMap = new HashMap<String, String>();
			carsHashMap.put("Corolla", "Toyota");
			carsHashMap.put("4Runner", "Toyota");
			carsHashMap.put("Civic", "Honda");
			carsHashMap.put("CR-V", "Honda");
			carsHashMap.put("Focus", "Ford");
			carsHashMap.put("Ranger", "Ford");
			
			
			//input model and return make
			System.out.println("What model car are you looking for? ");
			String carModel = input.next();
			System.out.println("That is a model of " + carsHashMap.get(carModel));
				
			}

	}
