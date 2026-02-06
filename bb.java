class bb
{
	public static void main (String ar[])
	{
		int[] a={-8,5,4,1,11,7,6,2};
		int  n=a.length ;
		for(int i=0 ; i<n-1;i++)
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