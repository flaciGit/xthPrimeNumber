package xthPrimeNumber;

import java.util.Scanner;

public class Main {

	public static boolean isPrime(int n) {
		
		int i = 2;
		while(i <= Math.sqrt(n)) {
			
			if(n % i == 0)
				return false;
			
			i++;
		}
		return true;
	}
	
	public static int findXthPrime(int x) {
		
		int db = 0;
		int number = 2;
		
		while(db < x) {
			if(isPrime(number))
				db++;
			number++;
		}
		return number-1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Giving the xth prime number.");
		System.out.println();

		Scanner scanner = new Scanner(System.in);

        int x;
        do {
            System.out.print("Enter x: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Invalid number, give x: \n");
            }
            x = scanner.nextInt();
        } while (x < 0);

        scanner.close();
		
        System.out.println("Xth prime: " + findXthPrime(x));
        
	}

}
