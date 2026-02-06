import java.util.*;
class bb
{
	public static void main (String ar[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");		
		int s=sc.nextInt();
		int[] a=new int[s];
			int  n=a.length ;
		System.out.println("Enter th array element ");
		for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
		for(int i=0 ;i<n-1;i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0 ; i<n; i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}


