import java.util.Scanner;
public class selectionsort {
	public static void Selectionsort(int[] myarr, int n)
	{
		for(int i=0;i< n-1;i++) //for index
		{
			int temp;
			for(int j=i+1;j<n;j++)
			{
				if(myarr[j]<myarr[i])
				{
					temp=myarr[i];
					myarr[i]=myarr[j];
					myarr[j]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element do you want: ");
		int n=sc.nextInt();
		int myarr[]= new int[n];
		System.out.println("\nElements in array are : ");
		for(int i=0;i<n;i++)
		{
			myarr[i]=sc.nextInt();
		}
		System.out.println("\nBefore sorting ");
		for(int i=0;i<n;i++)
		{
			System.out.println(myarr[i]);
		}
		Selectionsort(myarr,n);
		System.out.println("\nAfter sorting ");
		for(int i=0;i<n;i++)
		{
			System.out.println(myarr[i]);
		}
	}
}
