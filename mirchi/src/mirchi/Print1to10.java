package mirchi;

public class Print1to10 {
	public static void main(String[] args) 
	{
		int number = 1;
		
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 10)
		{
			System.out.print(num +" "); 
			printNumbers(num + 1);
		}	
	}
}
