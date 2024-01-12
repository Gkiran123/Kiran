package primenumber;

public class NumberPrime {

	public static void main(String[] args) 
	{
		 int number = 7;
	        
	        if (isPrime(number)) // Call the "isPrime" method with the "number" variable and check its result.
	        {
	            System.out.println(number + " is a prime number.");// If the result is true, print this message.
	        } else {
	            System.out.println(number + " is not a prime number.");// If the result is false, print this message.
	        
	        }
	    }
	    
	    public static boolean isPrime(int num) {// This is the definition of the "isPrime" method.
	        if (num <= 1) {
	            return false; // If the number is less than or equal to 1, it's not prime, so return false.
	        }
	        
	        // Check for divisibility by numbers from 2 to the square root of the number
	        for (int i = 2; i <= Math.sqrt(num); i++) {// Iterate from 2 to the square root of "num."
	            if (num % i == 0) {
	                return false; // If it's divisible, it's not prime
	            }
	        }
	        
	        return true; // If no divisor found, it's prime
	    }

	}

