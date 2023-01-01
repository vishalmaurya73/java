import java.util.*;
public class ArrayCC {




    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }

     }

//find array indexing position


    public static int linearSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }

    

    //Find the largest number of array

    public static int getlargest(int number[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }

        }
        System.out.println("smallest value= "+smallest);
      
        return largest;
        
         

    }


    //Reverse Array
    public static void ReverseArry(int number[]){
        int first=0;
        int last=number.length-1;

        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
        
    }
    







    public static void main(String []args){
    // int marks[]={97,98,99};
       //  update(marks);
    // for(int i=0; i<marks.length; i++){
    //     System.out.print(marks[i]+" ");
    //  }
    //  System.out.println();




//find array indexing position

   /*  int number[]={1,2,5,3,4,8,12,10,19};
     int key=10;
    int index=linearSearch(number, key);
  
     if(index==-1){
        System.out.println("Not found");
     }
     else{
        System.out.println("Your number Postions= "+ index);
     }
     */



// find largest number

/*int number[]={10,1,4,5,7,34,2,9,8};
System.out.println("largest value is: "+getlargest(number));
*/


//Reverse Array
int number[]={1,2,3,4,5,6,7,8,9};
ReverseArry(number);
for(int i=0; i<=number.length; i++){
    System.out.print(number[i]+" ");

}
System.out.println();






     
    }
    
}
