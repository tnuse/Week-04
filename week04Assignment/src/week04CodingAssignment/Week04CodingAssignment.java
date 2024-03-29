package week04CodingAssignment;


public class Week04CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//
//		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//
		
		
// Instantiating array ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// Printing out the value of the first element subtracted from the last element.
		System.out.println("#1.a");
		System.out.println("The first element in the ages Array subtracted from the last element is: " + ((ages[ages.length- 1]) - ages[0]));
		
		
//		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
//
//			i. Make sure that there are 9 elements of type int in this new array.  
//
//			ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
//
//			iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
//
		
		// Instantiating the second array, ages2
		int[] ages2 = {12, 18, 32, 6, 4, 19, 42, 66, 24};
		
		
		// Printing out the first element in ages2 subtracted from the last element in ages2, using the .length method so Arrays of different lengths can be used.
		System.out.println("\n#1.b");
		System.out.println("The first element in the ages2 Array subtracted from the last element is: " + ((ages2[ages2.length- 1]) - ages2[0]));
		
		
//		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		//  Creating int variable total to calculate the total of all elements in ages2
		int total = 0;

		// Enhanced for loop to calculate the sum of all elements in ages2
		for (int i : ages2) {
			total += i;
		}

		// Printing out the average of all elements in ages2 by dividing the total variable by the number of elements in the ages2 array, using the .length method. 
		System.out.println("\n#1.c");
		System.out.println("The average age is: " + total/ages2.length);

	

//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//
//		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//
//		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

		// Creating an array of String
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// Creating String variable to store new String of String Array elements
		String allNames = "";
		// Creating int variable to store the total number of characters int names and add each name to the allNames String.
		int totalChar = 0;
		for (String str : names) {
			totalChar += str.length();
			allNames += (" " + str); 
		}
		// Print out the average number of letters in each element of names
		System.out.println("\n#2.a & 2.b");
		System.out.println("The average number of characters in the following names is: " + totalChar/names.length);
		// Print out allNames String.
		System.out.println("Names are: " + allNames);

		
		
//		3. How do you access the last element of any array?
//		4. How do you access the first element of any array?
		System.out.println("\n#3");
		System.out.println("You access the last element of an array by using arrayName[arrayName.length - 1].");
		
		System.out.println("\n#4");
		System.out.println("You access the first element if an array by using arrayName[0].");


		
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
// 
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//
//     Solution for both 5 and 6
		
		// Creating int variables for calculations in both loops below
		int elementTotal = 0;
		int index = 0;
		
		// Create new int Array to add number of characters for each element int the names Array to the new namesLength Array.
		int[] nameLengths = new int[names.length];
		
		// Enhanced for loop to add the character count for each element of the names Array to the nameLengths Array.
		for (String str : names) {
			nameLengths[index] = str.length();
			index ++;
		}

		// for loop to calculate the sum of all elements in the nameLengths Array.
		for (int i = 0; i < nameLengths.length; i++) {
			elementTotal += nameLengths[i];
		}

		// Print out the sum of all elements in the nameLengths Array
		System.out.println("\n#5 & #6");
		System.out.println("The sum of all elements in the array is: " + elementTotal);

		
		
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

		String word = "Hello!";
		int n = 5;
		System.out.println("\n#7");
		System.out.println(concatenatedStrings(word, n));

		
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

		String firstName = "Bobby";
		String lastName = "Smith";
		System.out.println("\n#8");
		System.out.println(fullName(firstName, lastName));
		
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

		int[] numbers = {12, 20, 16, 32, 24};
		System.out.println("\n#9");
		System.out.println(moreThanOneHundred(numbers));

		
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.

		double[] doubleArray1 = {14.0, 77.5, 16.23, 33.4};
		System.out.println("\n#10");
		System.out.println("The average of all the elements in doubleArray1 is: " + (doubleArray1(doubleArray1)));
		

// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

		double[] doubleArray2 = {19.1, 22.4, 4.45, 11.32};
		System.out.println("\n#11");
		System.out.println("Is the average of doubleArray1 greater than doubleArray2: " + (isFirstGreaterThanSecond(doubleArray1, doubleArray2)));
		

		
		// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		boolean isHotOutside = true;
		double moneyInPocket = 11.75;
		System.out.println("\n#12");
		System.out.println("It's hot out and I have enough money, so I'm going to buy a drink? " + (willBuyDrink(isHotOutside, moneyInPocket)));
		
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
// The method uses data input by a user to determine what a loan or credit card balance will be in x number of months, using a current balance, fixed APR, static monthly payments, and an average of additional monthly purchases.  This was created to determine what my credit card balances would be in any give number of months.
		


	}  //  *** END OF MAIN ***

	
//  **** METHODS BEGIN ****
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

	// Method to create a new String using provided String and int determining how many times to concatenate that string.
	public static String concatenatedStrings(String word, int n) {
		String newString = "";
		// for Loop to create a new String using provided String and int determining how many times to concatenate that string. 
		for (int i = 0; i < n; i++) {
			newString += word;
		}
		// Return new String
		return newString;
	}
	
	
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	// Method to concatenate 2 String, with a space in the middle 
	public static String fullName(String firstName, String lastName) {
	// create new String, concatenating to 2 provided Strings, with a space between them.
		String fullName = firstName + " " + lastName;
	// Return new String
		return fullName;
	}
	

// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	// Method to calculate all elements in int Array and return True if the sum is greater than 100. 
	public static boolean moreThanOneHundred(int[] numbers) {
	// New int variable to store total of all Array elements
		int total = 0;
	// Enhanced for Loop to calcualte the sum of all elements in int Array
		for (int number : numbers) {
			total += number;
		}
		// Return True or False depending on value of total int.
		return (total > 100);
	}
	
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.

	// Method to return a double for the average of all elements in a double Array. 
	public static double doubleArray1(double[] doubleArray1) {
	// Double variable to store the sum of all elements in doubleArray1
		double array1Total = 0;
	// Enhanced for Loop to calculate the sum of all elements in doubleArray1 
		for (double number : doubleArray1) {
			array1Total += number;
		}
	// Return average of all elements in doubleArray1
		return array1Total/doubleArray1.length;
	}
	
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	// Method to return a boolean based on if the average of the elements in doubleArray1 is greater than the average of the elements in doubleArray2.
	public static boolean isFirstGreaterThanSecond (double[] doubleArray1, double[] doubleArray2) {
	// create double variables to store the sum of all elements in doubleArray1 and doubleArray2
		double array1Total = 0;
		double array2Total = 0;
		// Enhanced for Loop to calculate the sum of all elements in doubleArray1
		for (double number : doubleArray1) {
			array1Total += number;
		}
		// Enhanced for Loop to calculate the sum of all elements in doubleArray2
		for (double number : doubleArray2) {
			array2Total += number;
		}
		// double variables to calculate the average of the sums of elements in doubleArray1 and doubleArray2 Arrays
		double array1Average = array1Total/doubleArray1.length;
		double array2Average = array2Total/doubleArray2.length;
		
		// return true or false if the average of elements in doubleArray1 is greater than the average of the elements in doubleArray2
		return (array1Average > array2Average);
	}
	
	
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	

	
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static double interestAccrued (double newBalance, int months, double interest, double monthlyPayments) {
		double interestAccrued = 0.00;
		for (int i = 0; i <= months; i++) {
		interestAccrued = (interestAccrued + (newBalance * interest / 12));
		}
		return interestAccrued;
	}
	public static double avgMonthlyInterest (double newBalance, int months, double interest, double monthlyPayments) {
		double interestAccrued = 0.00;
		double avgMonthlyInterest = 0.00;
		for (int i = 0; i <= months; i++) {
			newBalance = (newBalance + (newBalance * interest / 12) - monthlyPayments);
			interestAccrued = (interestAccrued + (newBalance * interest / 12));
		}		
		avgMonthlyInterest = (interestAccrued / months);
		return avgMonthlyInterest;
	}
	public static double newBalance(double newBalance, int months, double interest, double monthlyPayments) {
		for (int i = 0; i <= months; i++) {
			newBalance = (newBalance + (newBalance * interest / 12) - monthlyPayments);
		}
		return newBalance;
	}
	
} // **** END OF CLASS ****

