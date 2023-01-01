public class binarysearch {
    public static int binarysearch(int number[], int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //comarision
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String [] args){
        int number[]={7,8,9,10,11,12};
        int key=10;
        System.out.println("index of key is: "+binarysearch(number,key));
    }
    
}
