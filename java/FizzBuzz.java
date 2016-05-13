/**
 * FizzBuzz.java
 * Purpose: Write a program that counts up to 100, and prints out each number, 
 * but prints “Fizz” if the number is divisible by 3. 
 * “Buzz” if the number is divisible by 5, and “FizzBuzz” 
 * if the number is divisible by both 3 and 5.
 */

public class FizzBuzz
{
	public static void main(String[] args)
	{
		for(int i = 0; i <= 100; i++)
		{
			if(i % 15 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0)
			{
				System.out.println("Fizz");
			}
			else if (i % 5 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
