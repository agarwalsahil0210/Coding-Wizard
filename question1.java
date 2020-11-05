import java.util.*;
public class question1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String dna=in.nextLine();
		String rna = "";
		for (int i=0;i<dna.length();i++){
			if (dna.charAt(i) == 'A')
				rna = rna + 'U';
			else if (dna.charAt(i) == 'T')
				rna = rna + 'A';
			else if (dna.charAt(i) == 'C')
				rna = rna + 'G';
			else if (dna.charAt(i) == 'G')
				rna = rna + 'C';
			else
			{
				System.out.println("Invalid Input"); System.exit(0); 
			}
		}
			System.out.println(rna);

	}
}