//0519 #7
//thread
//Runnable ���� expr / �Լ����� �������
package test7;

public class test extends Thread
{
	
	public static void main(String[] args) 
	{
		//lamda expression
		Runnable task =() ->
		{
			int x = 10;
			int y = 20;
			System.out.println("x+y = " + (x+y));
		};
		
		Thread t1 = new Thread(task);
		t1.start();
		
		Thread t2 = new Thread(task);
		t2.start();
	}

}