package homework;

import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		int i,j;
		String temp;
        System.out.println("enter no. of strings");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(i=0;i<n;i++)
			s[i]=sc.next();
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(s[i]);
	}

}
