package homework;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
    	int flag=1,i,j;
    	System.out.println("enter a string to check whether it is palindrome or not.");
    	Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(i=0,j=s.length()-1;i<=j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				{
				flag=0;
			    break;
			}
		}
		if(flag==0)
			System.out.println("it is not palindrome");
		else
			System.out.println("it is a palindrome");
		
	}
}
