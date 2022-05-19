//0519 #6
package test6;

public class test extends Thread
{
	private int thread_id;
	
	public test(int i)
	{
		this.thread_id = i;
	}
	
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(this.thread_id + "thread start");
		try 
		{
			Thread.sleep(1000);
		} 
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		test t1 = new test(1);
		t1.start();
		
		test t2 = new test(2);
		t2.start();
		
		System.out.println("main end");
	}

}
