package test3;
import java.util.Scanner;

class CheckAgeEXception extends Exception
{
	public CheckAgeEXception()
	{
		super("���̰� ��ȿ���� ����");
	}
}
public class test 
{
	public static int checkAge() throws CheckAgeEXception
	{
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if (age< 0) throw new CheckAgeEXception();
		
		return age;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		//int age = s.nextInt(); //����???
		
		try
		{
			int age = checkAge();
			System.out.println("age : " + age);
		}
		catch(CheckAgeEXception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
