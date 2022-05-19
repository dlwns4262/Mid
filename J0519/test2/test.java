//0519 #2
//file try catch
package test2;
import java.io.File;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;

class test1
{
	public void me()
	{
		try
		{
			InputStream in = new FilterInputStream("input.txt");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
class test2
{
	public void me() 
	{
		try
		{
			InputStream in = new FilterInputStream("input.txt");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
	}
}
public class test 
{
	public static void main(String[] arge)
	{
		test1 t1 = new test1();
		t1.me();
		
		test2 t2 = new test2();
		t2.me();
		
	}
}
