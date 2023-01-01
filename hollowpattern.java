import java.nio.file.SecureDirectoryStream;
import java.util.*;
public class hollowpattern {


    /*   *******
     *   *     *
     *   *     *
     *   *     *
     *   *******
     */
    public static void hollowpattern(int a, int b){

  
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1||i==a||j==1||j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               

            }
            System.out.println(" ");
        }
    }



    //    *
    //   **
    //  ***
    // ****

public static void htpattern(int a){
    for(int i=1; i<=a; i++){
        for(int j=1; j<=a-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
   
   
}



/*  12345
 *  1234
 *  123
 *  12
 *  1
 */


public static void numberpattern(int a){
    for(int i=1; i<=a; i++){
        for(int j=1; j<=a-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
   


   //Floye rangle
   /* 1
    * 2 3
      4 5 6
      7 8 9 10
      11 12 13 14 15
      
    */

    public static void floyedpattern(int a){
        int count=1;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }  


/*  1
 *  0 1
 *  0 1 0
 *  1 0 1 0
 *  1 0 1 0 1
 */
 
  public static void solidpattern(int a){
    for(int i=1; i<=a; i++){
        for(int j=1; j<=a-i+1; j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
  }


  //Solid Rombus
  /*
   * 
   *      *****
   *     *****
   *    *****
   *   *****
   *  *****
   */

   public static void solid_rhombus(int a){
    for(int i=1; i<=a; i++){
        for(int j=1; j<=(a-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=a; j++){
            System.out.print("*");
        }
        System.out.println();
    }
   
   }

   //Hollow Rombus
   /*
    *      *****
         *    *
       *    *
      *    *
     ***** 
    */

    public static void hollow_rombus(int a){
        int j=1; 
        for(int i=1; i<=a; i++){
            for(j =1; j<=(a-i); j++){
                System.out.print(" ");
            }
            for(j=1; j<=a; j++){
                if(i==1|| i==a || j==1 || j==a ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    // Dimoand pattern
    /*
     *     *
     *    ***
     *   *****
     *  *******
     *  *******
     *   *****
     *    ***
     *     *
     */

     public static void diomand_pattern(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=(a-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=a; i>=1; i--){
            for(int j=1; j<=(a-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       // int b=sc.nextInt();

       // hollowpattern(a,b);
       
       //htpattern(a);

       //numberpattern(a);

       //floyedpattern(a);

       //solidpattern(a);

       //solid_rhombus(a);

       //hollow_rombus(a);

       diomand_pattern(a);
    }
    
}
