import java.util.*;
public class w9ques4 {
	public static void main(String args[])
	{

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no. of columns");
		int n=in.nextInt(); 
		String s="1",s2="";
		int j,s1=n/2,i,p,a=1;
		for ( i=1;i<=n;i++)
		{   p =n/2+1;
		if (i<=p)
		{
			for ( j=1;j<=s1;j++)
				System.out.print(" ");
			s1--;

			System.out.println(s);
			a+=1;
			s=a+s+a;
		}
		s2=a+"";
		if(i==p) 
		{
			s=s.replace(s2,"");
			a--;
			s1++;
		}
		if(i>p)
		{
			s1++;
			for ( j=1;j<=s1;j++)
				System.out.print(" ");

			s2=a+"";
			a--;
			s=s.replace(s2,"");
			System.out.println(s);
		}

		}
	}
}