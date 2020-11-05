public class question3 {
	public static void main(String[] args) {
		long num, maxl=0,longestnum=0;
		for (long i = 2; i<=1000000;i++) {
			long l=1;
			num=i;
			while (num!= 1) {
				if ((num % 2)==0) 
				{
					num=num/2;
				} else {
					num=num*3+1;
				}
				l++;
			}
			if (l>maxl) 
			{
				maxl = l;
				longestnum = i;
			}
		}
		System.out.println(longestnum);
	}
}