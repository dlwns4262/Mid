package test9;

public class test extends Thread
{
	public static void main(String[] args)
	{
		Runnable task1 =() ->
		{
			int x = 10;
			int y = 20;
			System.out.println("x+y = " + (x+y));
		};
		
		Runnable task2 =() ->
		{
			int x = 20;	
			int y = 30;
			System.out.println("x+y = " + (x+y));
		};
		
		Thread t1 =new Thread(task1);
		t1.start();
		
		Thread t2 =new Thread(task2);
		t2.start();
	}
}