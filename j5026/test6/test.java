package test6;

interface printable
{
	public void print(String s);
}


public class test 
{
	public static void main(String[] args) 
	{
		printable p;
		
		// t=()->{};
		p = (String s) ->{System.out.println(s);};
		p.print("LAmbda expr one");
		
		p = (String s) ->{System.out.println(s);};
		p.print("LAmbda expr two");
	}

}
