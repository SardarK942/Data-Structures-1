/* Enter the Numher
9
Natural log of your Number is: 2.1972245773362196
4
2
1
It took 3 iterations to get to 1 

Enter the Numher
57
Natural log of your Number is: 4.04305126783455
28
14
7
3
1
It took 5 iterations to get to 1

Sardar Khan
*/





package algs11;

import stdlib.StdIn;
import stdlib.StdOut;

public class Assignmnet1_b {
public static void main (String[] args) {
	int n;
	int i=0;
	StdOut.println("Enter the Numher");
	n = StdIn.readInt();
	StdOut.println("Natural log of your Number is: " + Math.log(n));
	for (i=0; n>1; i++) { 
		
	n = n/2;
	StdOut.println(n);
	
	}
	
	StdOut.println("It took " + i + " iterations to get to 1");
	
	}
	
	

}
