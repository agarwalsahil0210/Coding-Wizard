import java.util.*;
public class w9ques1 {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.println("Enter sum");
		int sum = in.nextInt();
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((a[i]+a[j]+a[k]) == sum)
					{
						System.out.println(a[i]+","+a[j]+","+a[k]);
						System.out.println("There is a triplet("+a[i]+" "+a[j]+" "+a[k]+") present in array whose sum is "+sum);
					}
				}
			}
		}
	}
}