import java.util.*;
public class Swite {
    public static void main(String []args){
        int a,b;
        char operator;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        operator=sc.next().charAt(0);
        // switch(a){
        //     case 1: System.out.println("Samosa");
        //     break;
        //     case 2: System.out.println ("Burger");
        //     break;
        //     case 3: System.out.println("Pizza");
        //     break;
        //     default:System.out.println("Sorry");
        // }
        switch(operator){
            case '+': System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
  break;
case '/':System.out.println(a/b);
break;
case '%':System.out.println(a%b);
break;      
default: System.out.println("Worng operator");

        }


        }
    
}
