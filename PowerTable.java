import java.util.Scanner;

public class PowerTable {
	public static void main (String [] args) {
		char loopResponse;
		Scanner loopYN = new Scanner (System.in);
		Scanner answer = new Scanner (System.in);
		System.out.println("Learn your squares and cubes!");
		
		do {
			int userInput;
			int loopCount = 1;
			System.out.print("Enter an integer:");
			userInput = answer.nextInt();
			System.out.printf ("%6s", " Number Squared Cubed");
			System.out.println();
			String lineBreak = String.format("%7s", "=====");
			System.out.print(lineBreak);
			System.out.print(lineBreak);
			System.out.println(lineBreak);
			while (loopCount <= userInput){
				String str1 = String.format("%4d", loopCount);
				String str2 = String.format("%8d", loopCount * loopCount);
				String str3 = String.format("%8d", loopCount * loopCount * loopCount);
				System.out.print(str1);
				System.out.print(str2);
				System.out.println(str3);
				
				loopCount++;
				
			}
			
			System.out.print("Continue?(Y/N):");
			loopResponse = loopYN.next().charAt(0);
			
			
		}while(loopResponse == 'y' || loopResponse == 'Y');
		
		System.out.println("Goodbye!");
		
		loopYN.close();
		answer.close();
		
		
		
		
		
	}
	
	
}