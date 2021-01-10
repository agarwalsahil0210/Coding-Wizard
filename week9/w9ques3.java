import java.util.*;
public class w9ques3 {
	public static void main(String args[])

	{
		Scanner in=new Scanner(System.in);
		int num[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		System.out.println("Enter the number");
		int n=in.nextInt();
		String str= "";  
		for (int i = 0; i < num.length; i++)
		{
			while (n >= num[i]) {
				str += roman[i];
				n =n- num[i];
			}
		}
		System.out.println(str);
	}
}