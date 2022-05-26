//0526 #2
// 홀짝수 쓰레드 join
// 1) runnable 40,41 error -> 변수 필드 upgrade
// 2) first main end, thus the result is incorrect
//		-> thread 동기 -> join requires try//catch
package test2;

public class test 
{
	static int odd_sum = 0;
	static int even_sum = 0;
	
	public static void main(String[] args)
	{
		Runnable task1 =()->
		{		
			for (int i=0; i<100; i++)
			{
				if (i % 2 == 1) odd_sum += i;
			}
			System.out.printf("odd sum = %d ", odd_sum);
		};
		
		Runnable task2 =()->
		{
			for (int i=0; i<100; i++)
			{
				if (i % 2 == 0) even_sum += i;
			}
			System.out.printf("even sum = %d\n", even_sum);
		};
		
		Thread t1 = new Thread(task1);
		t1.start();
	
		Thread t2 = new Thread(task2);
		t2.start();
		
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	
		int tot_sum = odd_sum + even_sum;
		System.out.println("tot_sum = " + tot_sum);
	}

}
