//0519 #3
package test3;
import java.util.Scanner;

class CheckAgeException extends Exception
{
	public CheckAgeException()
	{
		super("���̰� ��ȿ���� �ʽ��ϴ�.");
	}	
}
public class test 
{
	public static int CheckAge() throws CheckAgeException
	{
		Scanner s = new Scanner(System.in);
		System.out.print("���̸� �Է� : ");
		int age = s.nextInt();
		if (age < 0)
			throw new CheckAgeException();
		return age;
	}
	
	public static void main(String[] args) 
	{
		int age;
		try
		{
			age = CheckAge();
			System.out.println("age = " + age);
		}
		catch (CheckAgeException e)
		{
			e.printStackTrace();
		}
	}
}
