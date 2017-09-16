package homework;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		System.out.println("Enter no. till which you want to print prime numbers");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag,i,j;
		for(i=2;i<n;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(i);
		}
	}

}
