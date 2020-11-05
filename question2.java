import java.util.*;
public class question2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int ran;
		char com;
		int point = 1, comScore = 0, userScore = 0;
		int round=1;
		while(round<=3){
			System.out.println("Enter Your Choice (S,R,P)");
			char user = in.next().charAt(0);
			ran = (1 + (int)(Math.random() * 3));
			if(ran==1)
				com='S';
			else if(ran==2)
				com='R';
			else
				com='P';
			if ((com == 'S') && (user == 'R')){
				System.out.println("You won the round.");
				userScore += point;}
			else if ((com == 'R') && (user == 'P')){
				System.out.println("You won the round.");
				userScore += point;}
			else if ((com == 'P') && (user== 'S')){
				System.out.println("You won the round.");
				userScore += point;}
			else if (com == user){
				System.out.println("It's a tie.");}
			else if ((com == 'S') && (user == 'P')){
				System.out.println("You lost the round.");
				comScore += point;}
			else if ((com == 'R') && (user == 'S')){
				System.out.println("You lost the round.");
				comScore += point;}
			else if ((com == 'P') && (user == 'R')){
				System.out.println("You lost the round.");
				comScore += point;}
			round++;
		}
		if (comScore >=2)
			System.out.println("Computer's score is "+ comScore+ "Your score is "+ userScore+ ", Computer won the game.");
		else if (userScore >= 2)
			System.out.println("You score is "+ userScore+ "Computer's score is "+ comScore+ ", You won the game.");
		else
			System.out.println("Match Tied");
	}
}       
