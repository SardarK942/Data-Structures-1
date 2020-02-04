package homework;

import java.util.Arrays;  // for testing purposes.  
import stdlib.*;

/**
 * CSC300Hw2  version 1.0
 * 
 *   Your Name goes here
 *   You class section  goes here
 * 
 * This is a skeleton file for your programming assignment. Edit the sections marked TODO. 
 *
 * Unless specified otherwise, you must not change the declaration of any method. 
 * This will be true of every skeleton file I give you.
 *
 * For example, you will get zero points if you change the line
 * <pre>
 *     public static int minCount (double[] list)
 * </pre>
 * to something like
 * <pre>
 *     public static void minCount (double[] list)
 * </pre>
 * or
 * <pre>
 *     public static double minCount (double[] list, int i) {
 * </pre>
 * 
 * Each of the functions below is meant to be SELF CONTAINED. This means that
 * you should use no other functions or classes.  You should not use any HashSets
 * or ArrayLists, or anything else unless specifically indicated! 
 * 
 */
public class CSC300Hw2 {

	/**
	 * minCount returns the number of values in the array that are equal to the minimum  
	 * Precondition: the array is nonempty.  
	 * 
	 * Here are some examples (using "==" informally):
	 *
	 * <pre>
	 *    1 == minCount (new double[] { -7 })
	 *    2 == minCount (new double[] { 1, 7, 1, 11 })
	 *    1 == minCount (new double[] { 5, 4, 3, 2, 1 })
	 *    3 == minCount (new double[] { 4, 5, 4, 6, 4, 10 })
	 *    5 == minCount (new double[] { 4, 4, 4, 4, 4 })
	 * 
	 * The code below is a stub version, you should replace the line of code
	 * labeled TODO  with code that achieves the above specification
	 * </pre>
	 */
	public static int minCount (double[] list) { 
		double minNum = list[0]; 
		for ( int i = 0; i < list.length; i++) {
			 if (list[i] < minNum)
				 minNum = list[i];
			
		}
		
		
		int countNum = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i]== minNum) {
				countNum++;
			}
		}
		return countNum;
	}
	
	

	/**
	 * posOfSmallestElementGtOeT returns the position of the smallest element in the array that 
	 * is greater than or equal to the limit parameter
	 * if all values are smaller than theVal, return -1;
	 * 
	 * Precondition:  the array is nonempty and all elements are unique.
	 * Your solution may go through the array exactly once.  
	 *
	 * <pre>
	 *   0 == posOfSmallestElementGtOeT(3, new double[] { 7 })                      // value: 7 is in pos 0
	 *   5 == posOfSmallestElementGtOeT(3, new double[] { 11, -4, -7, 4, 8, 1 }),   // value: 4 is in pos 3
	 *  -1 == posOfSmallestElementGtOeT(17, new double[] { 1, -4, -5, 7, 8, 11 }),  // all elements are < 17
	 * 
	 * The code below is a stub version, you should replace the line of code
	 * labeled TODO  with code that achieves the above specification
	 * </pre>
	 */
	public static int posOfSmallestElementGtOeT( double limit, double[] list) {
		double minLimNum = list[0];
		int posVal = -1;
		for ( int i = 0; i < list.length; i++) {
			 if (list[i] < minLimNum && list[i] >= limit)
				list[i] = minLimNum; 
			 if (list[i]==minLimNum && list[i] >= limit)
				 posVal = i;
			 
			 
			 
		}
		

		
		return (posVal);
				 
				
			
		}


	

	/**
	 * stringReformat takes a person's name in the format  <Last, First{ Initial.}>  and
	 * reformats it to the form  <First {Initial }Last> 
	 * {} means may or may not be present
	 *
	 * Preconditions:  
	 *       the string is not empty
	 *       there is exactly one ','  (comma) and it comes at the end of the Last name
	 *       there is 1 space after the comma
	 *       there may or may not be a middle initial after the first name
	 *       If there is a middle initial, it will be separated from the first name by a single space
	 *       The middle initial will be followed by a '.' and 0 or more spaces.
	 * 
	 * Here are some examples ("<--" indicates the returned value
	 *
	 * <pre>
	 *   "Alex P Keaton"  <--  stringReformat("Keaton, Alex P.");
	 *   "Lois Steem"     <--  stringReformat("Steem, Lois");        // no middle initial
	 *   "Luke A Boyd"    <--  stringReformat("Boyd, Luke A");       // no '.'
	 *   "Lotta B Essen"  <--  stringReformat("Essen, Lotta B.  ");  // extra spaces at end
	 *   
	 *   You may only use the  length,  substring  and charAt methods of the string class.
	 *   You may not use any other Java classes or functions without permission
	 *         Some sample code to help you think about the problem is given below for your reference; 
	 *         you should delete this from the solution you submit for credit.
	 *   You may write additional functions to help solve this problem if you want.
	 *   
	 *   Hints:  
	 *         Find the location of the  ',' and ' ' (spaces)  using charAt
	 *         Build the new string by extracting the corresponding substrings and concatenating them together
	 * </pre>
	 */
	public static String stringReformat( String name) {
		 String lastName = "";
		 String firstName = "";
		 String middleName = "";
		 String finalAnswer;
		 for (int i = 0 ; i < name.length(); i++) {
			 if (name.charAt(i) == ',' && name.charAt(i+1) ==' ')
				 lastName = name.substring(0, i);
			 	//StdOut.println(lastName);
			 
			 if (name.charAt(i) == ' ' && name.charAt(i-1) != ',')
				 firstName = name.substring(lastName.length() +2, i);
			 	//StdOut.println(firstName);
			     
			 if (name.charAt(i) =='.')
				 middleName = name.substring(i-1, i);
			 	//StdOut.println(middleName);
			 
			 
			 	 
			 
			 
			 		
		 }
		 if (firstName == "")
				 firstName = name.substring(lastName.length()+2, name.length());
		 if (middleName == "" || firstName.charAt(firstName.length()-1) == '.')
			finalAnswer = firstName + " " + lastName;
		 else
		 finalAnswer = firstName + " " + middleName + " "+ lastName;
	
		 return finalAnswer;		  
		 }

		

		
		
		//String theAnswer;	
		//  example code starts here:  delete or comment out when you have completed the function
		//String  subExample = name.substring(1,5);
		//char  theChar = name.charAt(4);
		//StdOut.println(" stringReformat demo1.  the substring(1,5) is: " + subExample);
		//if ( theChar == ',' )
			//StdOut.println(" stringReformat demo2.  the character in position 4 is a comma");
		//else
		//	StdOut.println(" stringReformat demo2.  the character in position 4 is NOT a comma, it is: "+ theChar);
		
		// String x = theAnswer + " " + subExample;


		//return theAnswer;   // TODO 3:  fix this.
		

	
	/**
	 * primesInRange determines  how many prime numbers occur with a range of values
	 * 
	 * A prime number is a number divisible only by itself and 1
	 * * 
	 * Here are some examples ("<--" indicates the returned value
	 *
	 *  4 <-- primesInRange(10,20);    // 11, 13, 17, 19
	 *  1 <-- primesInRange(20,28);    // 23
	 *  0 <-- primesInRange(122,130);  // no primes in this range
	 *  1 <-- primesInRange(23,23);    
	 * 
	 * Precondition:  0 < low <= high
	 *
	 * The code below is a stub version, you should replace the line of code
	 * labeled TODO  with code that achieves the above specification
	 * 
	 * Suggestion:  write a helper function  isPrime  to determine if a number is prime
	 */
	
	public static boolean isPrime(int num) {
		boolean flag = true;
		for(int i =2; i <= num/2; i++) {
			if (num % i == 0)
				flag = false;		
		}
		return flag;
	}
	public static int primesInRange( int low, int high) {
		int primeCounter = 0;
		for (int i=low; i <= high; i++ ) {
			if (isPrime(i) == true)
				primeCounter++;
		}
	return primeCounter;
			
		}


	/*
	 * A test program, using private helper functions.  See below.
	 */
	public static void main (String[] args) {
		// do all the tests
		minCountTests();
		posOfSmallestElementGtOeTTests(); 
		stringReformatTests();
		primesInRangeTests();

		StdOut.println ("Finished tests");
	}

	/* Test functions --- lot's of similar code!    Do not change any of the code below*/


	private static void minCountTests() {
		// for minCount: array must be nonempty
		testMinCount (1, new double[] {11} );
		testMinCount (5, new double[] { 11,11,11,11,11} );
		testMinCount (1, new double[] {11, 1} );
		testMinCount (1, new double[] {1,11} );
		testMinCount (1, new double[] {11, 21, 9, 31, 41});
		testMinCount (1, new double[] {41, 21, 9, 31, 11});
		testMinCount (1, new double[] {11, 41, 9, 31, 21});
		testMinCount (1, new double[] {-41, -21, -11, -31, -9});
		testMinCount (1, new double[] {-9, -21, -11, -31, -41});
		testMinCount (1, new double[] {-41, -11, -9, -31, -21});
		testMinCount (1, new double[] {-11, -21, -41, -31, -9});		
		testMinCount (3, new double[] { 0.2, -0.5, -0.1, -0.5, -0.5});
		StdOut.println(" finished minCount tests");
	}
	private static void testMinCount (int expected, double[] list) {
		int actual = minCount (list);  // calls your function

		if (expected != actual) {   // compares your result with the expected result
			StdOut.format ("Failed minCount(%s): Expecting (%3d) Actual (%3d)\n", Arrays.toString(list), expected, actual);
		}
	}
	private static void posOfSmallestElementGtOeTTests() {
		//  array must be nonempty with unique elements
		//   arg0: answer, arg1: limit, arg2: the array
		testPosOfSmallestElementGtOeT (0, 0, new double[] {0});
		testPosOfSmallestElementGtOeT (3, -5, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (3, -5.5, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (0, 0, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (5, -10, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (-1, 10, new double[] {1,2,3,-5,-6,-8, 6, 7});

		StdOut.println(" finished smallest Element tests");
	}
	private static void testPosOfSmallestElementGtOeT(int expected, double limit, double[] list) {

		int actual = posOfSmallestElementGtOeT (limit,list); // calls your function

		if (expected != actual) { // compares your result with the expected result
			StdOut.format ("Failed posOfSmallestElementGtOeT(%5.2f , %s): Expecting (%d) Actual (%d)\n", limit, Arrays.toString(list), expected, actual);
		}
	}	
	private static void stringReformatTests() {
		testStringReformat("Keaton, Alex P.", "Alex P Keaton");
		testStringReformat("Steem, Lois", "Lois Steem");
		testStringReformat("Boyd, Luke A.   ", "Luke A Boyd");
		testStringReformat("Essen, Lotta B.", "Lotta B Essen");
		testStringReformat("Rittenoff, Candace B.", "Candace B Rittenoff");
		testStringReformat("Early, Stu", "Stu Early");
		testStringReformat( "Keaton, Alex P.", "Alex P Keaton");
		testStringReformat("Bruptly, Vera A. ", "Vera A Bruptly");
		testStringReformat("Datso, Wanda Y.", "Wanda Y Datso");
		testStringReformat("Silver, I O.", "I O Silver");
		StdOut.println( " finished stringReformat tests");	
	}
	private static void testStringReformat (String stringToTest, String expected) {

		String actual = stringReformat( stringToTest);    // calls your function

		if ( ! actual.equals(expected))        // compares your result with the expected result
			StdOut.format ("Failed  testStringReformat:  Expected: (%s)  Actual (%s) \n", expected, actual);

	}
	private static void primesInRangeTests() {
		//  precondition:  2 <= low <= high
		//   arg0: answer, arg1: low, arg2: high
		testPrimesInRange( 1,2,2);
		testPrimesInRange( 1,3,3);
		testPrimesInRange( 2,3,5);
		testPrimesInRange( 2,25,31);
		testPrimesInRange(143,100,1000);
		testPrimesInRange(1061,1000,10000);
		StdOut.println(" finished PrimesInRange tests");
	}
	private static void testPrimesInRange (int expected, int low, int high) {
		if ( low > high ) throw new IllegalArgumentException(" testCaseError in testPrimesInRange");
		int actual = primesInRange(low, high);    // calls your function

		if ( actual != expected)        // compares your result with the expected result
			StdOut.format ("Failed  primesInRange:  Expected: (%d)  Actual (%d) \n", expected, actual);

	}

}