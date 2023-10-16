public class kadane {
    public static void kadane_solution(int array[]){
        int current_sum = 0 ;
        int maximum_sum = Integer.MIN_VALUE ;
        for(int i=0 ;i<array.length ;i++){
            current_sum = current_sum + array[i] ;
            if(current_sum<0){
                current_sum = 0 ;
            }
            maximum_sum = Math.max(maximum_sum,current_sum) ;
        }
        System.out.println("Maximum sum of subarrays are : "+maximum_sum);

    }
    public static void main(String[] args){
        int array[] = {-1,-2,3,4,-3,10} ;
        kadane_solution(array) ;

    }
}
