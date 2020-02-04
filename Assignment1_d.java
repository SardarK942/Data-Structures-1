/* Enter the value of M:
9
V is 1
sumSquares Function:1.0
formula: 1.0
V is 2
sumSquares Function:5.0
formula: 5.0
V is 3
sumSquares Function:14.0
formula: 14.0
V is 4
sumSquares Function:30.0
formula: 30.0
V is 5
sumSquares Function:55.0
formula: 55.0
V is 6
sumSquares Function:91.0
formula: 91.0
V is 7
sumSquares Function:140.0
formula: 140.0
V is 8
sumSquares Function:204.0
formula: 204.0
204.0 

Sardar Khan */






import stdlib.StdIn;
import stdlib.StdOut;

public class Assignment1_d  {
	
	
	
public static double squareSum(int n) {
	double sum = 0.0;
		for (int i = 1; i!=n; i++) {
		 sum += Math.pow(i,2);
		 StdOut.println("V is " + i);
		 StdOut.println("sumSquares Function:"+ sum );
		 double formula = i*(i+1)*(2*i+1)/6; 
		 StdOut.println("formula: " + formula);
	}
		return sum;
		
		
	}


	public static void main(String[] args) {
		StdOut.println("Enter the value of M:");
		
		int M = StdIn.readInt();
		StdOut.println(squareSum(M));
	}

	
}


