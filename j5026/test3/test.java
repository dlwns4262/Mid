//0526 #3
// 홀짝수 쓰레드 join
// 1) runnable 40,41 error -> 변수 필드 upgrade
// 2) first main end, thus the result is incorrect
//		-> thread 동기 -> join requires try//catch
// 람다 expr.
package test3;

public class test {

	   static int odd_sum = 0;
	   static int even_sum = 0;
	   
	   public static void main(String[] args) {

	      Runnable task1 = new MyRunnable1();
	      Runnable task2 = new MyRunnable2();
	      
	      Thread t1 = new Thread(task1);
	      t1.start();
	      
	      Thread t2 = new Thread(task2);
	      t2.start();
	      
	      try {
	         t1.join();
	      } catch (InterruptedException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      try {
	         t2.join();
	      } catch (InterruptedException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      int tot_sum = odd_sum + even_sum;
	      System.out.println("tot_sum = " + tot_sum);
	      
	  }

}

class MyRunnable1 extends test implements Runnable {

   public void run()
   {
      for (int i=0; i<100; i++)
      {
         if (i % 2 == 1) odd_sum += i;
      }
      System.out.printf("odd sum = %d\n", odd_sum);
   }
}

class MyRunnable2 extends test implements Runnable {

   public void run()
   {
      for (int i=0; i<100; i++)
      {
         if (i % 2 == 0) even_sum += i;
      }
      System.out.printf("even sum = %d\n", even_sum);
   }
}
