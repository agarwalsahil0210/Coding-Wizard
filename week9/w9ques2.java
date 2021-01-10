import java.util.*;
public class w9ques2 {

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("First String:");
		String str1=in.nextLine();
		System.out.print("Second String:");
		String str2=in.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		String str3="";
		for(int i=0;i<str2.length();i++)
		{
			char ch=str2.charAt(i);
			str3=Character.toString(ch);
			str1=str1.replace(str3,"");
		}

		System.out.println("Output:"+str1);
	}
}