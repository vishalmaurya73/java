import java.util.*;
public class greatest{
    public static void main(String []args){
        int a, b, c;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("A");
        }
            else if(b>=c){
                System.out.println("B");
            }
                else{
                    System.out.println("C");
                }
            }

        }
    