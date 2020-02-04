/* Pick a number, to stop enter 0
4.0
Pick another Number, to stop enter 0
-3.7
Pick another Number, to stop enter 0
-2.9
Pick another Number, to stop enter 0
3.5
Pick another Number, to stop enter 0
0
Average of Positive Numbers: 3.75
Product of all Negative integers: 10.73
Total Entries: 4 

Sardar Khan
*/



package stdlib;

public class Assignment1_C {
	public static void main(String[] args) {
		double sumPos = 0.0;
		double prodNeg = 1.0;
		int posCount = 0;
		int negCount = 0;
		StdOut.println("Pick a number, to stop enter 0");
		double num = StdIn.readDouble();

		while (num != 0) {
			if (num > 0) {
				posCount++;
				sumPos += num;
				StdOut.println("Pick another Number, to stop enter 0");
				num = StdIn.readDouble();
			} else {
				if (num < 0) {
					negCount++;
					prodNeg *= num;
					StdOut.println("Pick another Number, to stop enter 0");
					num = StdIn.readDouble();
				}
			}
		}
		double avg = sumPos / posCount;
		StdOut.println("Average of Positive Numbers: " + avg);
		StdOut.println("Product of all Negative integers: " + prodNeg);
		StdOut.println("Total Entries: " + (posCount + negCount));

	}

}
