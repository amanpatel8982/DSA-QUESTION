import java.util.Arrays;

class GetMinMax{


   static void findMinMax(int [] arr) {
        if(arr == null || arr.length==0);

        int n = arr.length;

        int min = arr[0];
        int max = arr[0];

        for(int i =1; i<n; i++){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        System.out.println(max+" maximum");
        System.out.println(min+" minimum");
    

   }

  static void findMinAndMax(int[] arr){
    int max = arr[0];
    int min = arr[0];

    for(int x : arr){
        if( x> max){
            max = x;
        }
        if (x < min) {
            min = x;
        }
    }

    System.out.println("MAX value = "+ max+ " min value = "+ min);
  }

    public static void main(String[] args) {

        int[] arr  = {1, 2, 6, 7, 3, 4,59, 1000, 15500,};

      findMinMax(arr);
      findMinAndMax(arr);

      Arrays.sort(arr);

       int n = arr.length;

       long min = arr[0];
       long max = arr[n-1];

       System.out.println("MIn value = " + min + " max value = "+max);
    }
    
}