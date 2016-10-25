public class problemSet0
{


public static void main(String[] args)
{

// 	System.out.println(toBinary(127));
// 	System.out.println(toBinary(100)); 
// 	System.out.println(toBinary(37)); //all working
// 	System.out.println(toBinary(1));
// 	System.out.println(toBinary(0));
	
	
// 	System.out.println(rollDie(1));
// 	System.out.println(rollDie(6));  //all working
// 	System.out.println(rollDie(23));
// 	System.out.println(rollDie(13));


// 	multiples(0);
// 	multiples(1);
// 	multiples(5);  // all working
// 	multiples(7);
// 	multiples(10);



}


/**
 * Creates a method named toBinary that will take in an int parameter and return 
 * a String that contains the binary digits representing the int.
 * @param decimal number to be converted to string as binary digits
 * @return String that is an 8 bit binary number
 */
	public static String toBinary(int n)
	{
		String s = "";
		if (n == 0)
			return ("00000000");
		
		while (n > 0)
		{	
			s = (n % 2) + s;
			n = n/2;
		}
		if (s.length() < 8)
		{
			int numberZeros = 8 - (s.length());
			
			String z = "";
			for (int i = 0; i < numberZeros; i ++)
			{		
				z += "0";
			}				

		z += s;
		return z;

	}	
		return s;
	
	}




/** Takes in an int n and returns the result of rolling a die with n sides on it
 * @param int n that determines how many sides the die has
 * @return an int from 1 - n (inclusive)
 */	
	public static int rollDie(int n)
	{
		return (int)(Math.random() * n + 1);
	}


/**
 * Takes in the number of rows as a parameter prints a “Multiple Table.”
 * @param int n that determines the number of rows
 * @return multiplication table
 */ 

 	public static void multiples(int n)
 	{
		for (int i = 1; i <= n; i++) 
		{
        	for (int j = 1; j <= i; j++) 
        	{
				int r = (i * j);
				System.out.print(r + " ");
        	}
        System.out.println();
        }
    }

/** 
 * given a positive integer n a parameter, computes and returns a new integer 
 * in which the units and tens digits have swapped places. 
 * @param int n that is the base number
 * @return int r that is the swapped number
 */

	public static int swap(int n)
	{
	
	
	}




}