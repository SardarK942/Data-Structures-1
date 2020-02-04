
/* enter number A to start
4
enter number B now 
6
enter num C now
4
the # of diff values is: 2
The Range is: 2
The power is: 16.0 


enter number A to start
6
enter number B now 
8
enter num C now
9
the # of diff values is: 3
The Range is: 3
The power is: 343.0

SARDAR KHAN */



package algs11;
import java.util.*;

import stdlib.StdOut;
import stdlib.StdStats;
import stdlib.StdIn;


public class Assignment_a {
	public static void main (String[] args) {
		int numCounter = 3 ;
		int numA;
		int numB;
		int numC;
		int maxOfNum = 0;
		int minOfNum;
		StdOut.println("enter number A to start");
		numA = StdIn.readInt();
		maxOfNum = numA;
		minOfNum = numA;
		StdOut.println("enter number B now ");
		
		numB = StdIn.readInt();
		maxOfNum = Math.max(maxOfNum, numB);
		minOfNum = Math.min(minOfNum, numB);
		StdOut.println("enter num C now");
		
		numC = StdIn.readInt();
		maxOfNum = Math.max(maxOfNum, numC);
		minOfNum = Math.min(minOfNum, numC);
		
	
		if (numA==numB){
			numCounter--;}
		if (numA == numC) {
			numCounter--;}
		if (numB == numC) {
			numCounter--;}
	
		StdOut.println("the # of diff values is: " + numCounter);


		int diff = maxOfNum-minOfNum;			
		StdOut.println("The Range is: "+ diff);
		double Avg = ((numA + numB + numC)/3);	
		double a = Avg;
		int b = diff;
		
		double power = Math.pow(a, b);
		StdOut.println("The power is: " + power);
		
			}
		}
		
		
		
	
		

	


