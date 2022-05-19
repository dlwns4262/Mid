//0519 #5
//multi thread
package test5;

public class test extends Thread
{
	private int num = 0;
	
	public test(int num)
	{
		this.num = num;
	}
	
	public void run()
	{
		System.out.println(this.num + "thread start");
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
		for(int i=0; i<10; i++)//seq
		{
			test t = new test(i);
			t.start();
		}
		System.out.println("main end");
	}

}
