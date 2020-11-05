import java.util.Scanner;

public class question4
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter date, month and y");
        int date=in.nextInt();
        String m=in.next();
        int y=in.nextInt();
        int days=date;
        int feb=((y% 4 == 0 && y % 100 != 0 ) || (y % 400 == 0))?29:28;
        switch(m){
        case "February":
            days += 31;
            break;
        case "March":
            days += 31+feb;
            break;
        case "April":
            days += (31*2)+feb;    
            break;
        case "May":
            days += (31*2)+feb+30;    
            break;
        case "June":
            days += (31*3)+feb+30;    
            break;
        case "July":
            days += (31*3)+feb+(30*2);    
            break;            
        case "August":
            days +=(31*4)+feb+(30*2);    
            break;
        case "September":
            days += (31*5)+feb+(30*2);    
            break;
        case "October":
            days += (31*5)+feb+(30*3);           
            break;            
        case "November":
            days += (31*6)+feb+(30*3);                
            break;                        
        case "December":
            days += (31*6)+feb+(30*4);            
            break;  
        }
        System.out.println("Day Number: "+days);
    }
}
