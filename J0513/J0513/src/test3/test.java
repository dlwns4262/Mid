package test3;
import java.util.Scanner;

class CheckAgeEXception extends Exception
{
	public CheckAgeEXception()
	{
		super("나이가 유효하지 않음");
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
		System.out.print("나이 입력 : ");
		//int age = s.nextInt(); //검증???
		
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
