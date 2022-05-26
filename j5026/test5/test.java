//0526 #4 critical section
//mutual exclusion : 상호배제
//buy sell count 재고관리
//thread, lambda 
package test5;

class Sales
{
	//critical sec.
	private int count = 0;
	
	//메소드 mutual exclusion 상호배제
	//synchronized나밖에 못들어온다? 이 안에 얘밖에 못들어옴? 먼저 들어온놈이 임자?
	synchronized public void buy()
	{
		count++;
	}
	synchronized public void sell()
	{
		count--;
	}
	
	public int getCount()
	{
		return count;
	}
}

public class test 
{
	static Sales s = new Sales();
	public static void main(String[] args) 
	{
		Runnable task1 =()->
		{
			for (int i=0; i<1000; i++)
				s.buy();
		};
		
		Runnable task2 =()->
		{
			for (int i=0; i<1000; i++)
				s.sell();
		};
		
		Thread t1 = new Thread(task1);
		t1.start();
		
		Thread t2 = new Thread(task2);
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count = " +s.getCount()); //필드
	}
}
