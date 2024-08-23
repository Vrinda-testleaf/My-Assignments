package week1.asssignment1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=15;
       boolean isprime=false;
       
		for(int i=2; i<=(n-1); i++)
		{
			if(n%i!=0)//9%2!=0
			{
		
			isprime=true;	
			
			}
			else 
				
			{
				isprime=false;
				System.out.println(n +" " + "is not a prime number");
				break;
			}
	
			
						
		}
		if(isprime) {
			System.out.println(n +" " +"is a prime number");
		}
		}
	}

