import java.util.*;
public class binarytodecimal {




      //find binary to decimal
 
      public static void bintodec(int n){
        int mynum=n;
        int pow=0;
        int dec=0;
        while(n>0){
        int lastdigit=(n%10);
        dec=dec+(lastdigit*(int)Math.pow(2,pow));
        pow++;
        n=n/10;
       }
       System.out.println("decimal of "+ mynum+" = "+dec);

    }


    //decimal to binary

    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int bin=0;
        while(n>0){
           int rem=n%2;
            bin=bin+(rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
            
            
        }
        System.out.println("Binary of "+mynum+" = "+bin);
    }


public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    // bintodec(n);
     dectobin(n);

}
    
}
