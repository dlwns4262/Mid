//0519 #12	
// ¶÷´Ù expr. class even odd number sum
package test12;

public class test extends Thread
{
	public static void main(String[] args) 
	{
		Runnable odd =() ->
		{
			int odd_sum =0;
			//odd number sum
			for(int i=0; i<100; i++)
			{
				if(i % 2 == 1)
					odd_sum += i;
			}
			System.out.println("odd sum = " + odd_sum);
		};
		
		Runnable even =() ->
		{
			int even_sum =0;
			//even number sum
			for(int i=0; i<100; i++)
			{
				if(i % 2 == 0)
					even_sum += i;
			}
			System.out.println("even sum = " + even_sum);
		};
		
		Thread o= new Thread(odd);
		o.start();
		
		Thread e = new Thread(even);
		e.start();
	}
}