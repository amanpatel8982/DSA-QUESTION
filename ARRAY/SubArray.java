public class SubArray {

    public int  maxSubArrays( int arr[]){
        int res = arr[0];
        int total = 0;
        for(int n : arr){
            if(total <0){
                total = 0;
            }
            total += n;
             res = Math.max(res, total);
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, -1, -2, 9};
        
        
    }
    
}
