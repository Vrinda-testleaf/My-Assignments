package week1.asssignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sum of preceding numbers
		
		int a=0;
		int b=1;
		int c;
		int range=8;
		
		//c=a+b;
		System.out.println(a);
		System.out.println(b);
		
		{
		for(int i=2; i<range; i++)
		{
			 c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
			
	}

}}
