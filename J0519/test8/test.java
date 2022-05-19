//0519 #8
//before ¶÷´Ù, multi class
package test8;

class Task1 extends Thread
{
	public void run()
	{
		int x = 10;
		int y = 20;
		System.out.println("x+y = " + (x+y));
	}
}

class Task2 extends Thread
{
	public void run()
	{
		int x = 20;
		int y = 30;
		System.out.println("z = " + (x+y));
	}
}
public class test 
{
	public static void main(String[] args)
	{
		Task1 t1 =new Task1();
		t1.start();
		
		Task2 t2 =new Task2();
		t2.start();
	}
}
