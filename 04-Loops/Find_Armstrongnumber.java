public class Find_Armstrongnumber {

	public static void main(String[] args) {
		
		int num=153;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
		    num=num/10;
		    sum=sum+rem*rem*rem;
		    
		}
		if(sum==num)
		{
			System.out.println("Its a armstrong number");
		}
		else
		{
			System.out.println("it not a armstrong number");
		}

	}

}
