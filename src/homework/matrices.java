package homework;
import java.util.Scanner;

public class matrices {
public static void main(String[] args) {
	int i,j,k,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of rows and columns of first matrix");
    int row1=s.nextInt();
	int col1=s.nextInt();
    int a[][] = new int[row1][col1];
    System.out.println("Enter the elements of first matrix");
    for (i=0; i<row1;i++)
        for (j=0;j<col1;j++)
           a[i][j] = s.nextInt();

    System.out.println("Enter the number of rows and columns of second matrix");
    int row2=s.nextInt();
   	int col2=s.nextInt(); 
     if ( col1 != row2)
        System.out.println("Matrices can't be multiplied");
     else
     {
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];

        System.out.println("Enter the elements of second matrix");

        for (i=0;i<row2;i++)
           for (j=0;j<col2;j++)
              b[i][j] = s.nextInt();

        for(i=0;i<row1;i++)
        {
           for(j=0;j<col2;j++)
           {   
              for(k=0;k<row2;k++)
              {
                 sum=sum+a[i][k]*b[k][j];
              }

              c[i][j] = sum;
              sum = 0;
           }
        }

        System.out.println("Product of entered matrices");

        for(i=0;i<row1;i++)
        {
           for(j=0;j<col2;j++)
              System.out.print(c[i][j]+"\t");

           System.out.print("\n");
        }
     }
  }
}

