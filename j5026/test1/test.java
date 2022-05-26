//0526 #1
// È¦Â¦¼ö ¾²·¹µå join
package test1;

public class test 
{
	public static void main(String[] args) 
	{
		int odd_sum = 0;
		for (int i=0; i<100; i++)
		{
			if (i % 2 == 1) odd_sum += i;
		}
		System.out.printf("odd sum = %d ", odd_sum);
		
		int even_sum = 0;
		for (int i=0; i<100; i++)
		{
			if (i % 2 == 0) even_sum += i;
		}
		System.out.printf("even sum = %d\n", even_sum);
		
		int tot_sum = odd_sum + even_sum;
		System.out.println("tot_sum = " + tot_sum);
	}

}
