// Reverse an Array

public class Reverse {

    public static void reverseArray(int []arr , int a, int b){

        if(a > b) return;
        int temp = arr[a];
           arr [a] = arr[b];
            arr[b] = temp;

            reverseArray(arr, a+1, b-1);
        
        // int first = 0, last = arr.length-1;

        // while(first < last){
        //     // swap 
        //     int temp = arr[last];
        //     arr[last] = arr[first];
        //     arr[first]= temp;

        //     first ++;
        //     last --;
        // }
    }
    public static void main(String args[])

    {

        int []arr = {1 ,2, 3, 4, 5, 6};
        int n =  arr.length;
        reverseArray(arr, 0, n-1);


        // int [] arr = { 2, 3, 4, 8, 19, 25};

        // reverseArray(arr);

        // // Print Array 

        // for(int i = 0; i<arr.length; i++){
        //     System.out.print( arr[i]+" ");
        // }
        // System.out.println();




    }
    
}
