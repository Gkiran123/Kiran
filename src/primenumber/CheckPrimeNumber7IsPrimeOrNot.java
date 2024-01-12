package primenumber;

public class CheckPrimeNumber7IsPrimeOrNot {

	public static void main(String[] args) 
	{
		int number = 7;
		
		if(isPrime(number))
		{
			System.out.println(number +"is prime number.");			
		}
		else
		{System.out.println(number + "is not a prime number.");
			
		}
	}
		public static boolean isPrime(int num)
		{
			if(num<=1)
				return false;// 0 & 1 are not prime numbers
		}
		{
		//check for divisibility by numbers from 2 to the square root of the number
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
		if(num % i==0)
		{
            return false; // If it's divisible, it's not prime
        }
    }
    
    return true; // If no divisor found, it's prime
}
		}
			
		}

	}

