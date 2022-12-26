import java.nio.file.SecureDirectoryStream;
import java.util.*;
public class functionormethod{

    public static void helloworld(){
        System.out.println("Hello world");
    }

    public static void calculator(){
        Scanner sc=new Scanner(System.in);
       
        int a=sc.nextInt();
       int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum); 
    }





    //factorial

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;  
        }
        return f;
        }

        // bionomial coffiecient

        public static int bioncoff(int n, int r){
            int fact_n=factorial(n);
            int fact_r=factorial(r);
            int fact_nmr=factorial(n-r);
            int bioncoff=fact_n/(fact_r*fact_nmr);
            return bioncoff;


        }
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(bioncoff(n, r));
            System.out.println(factorial(n));
        }



      
}