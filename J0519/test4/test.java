package test4;

public class test extends Thread
{
	//持失切
	//五社球
	public void run()
	{
		System.out.println("thread start");
	}
	public static void main(String[] args) 
	{
		test t = new test();
		t.start();
		
		test t1 = new test();
		t1.start();
		
		System.out.println("main end");
		
		Thread t2 = new Thread();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
	}
}
