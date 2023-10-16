public class subarray_pair {
    public static void subarray(int array[]){
        int total = 0 ;
        int sum = 0 ;
        int max = 0 ;
        for(int i=0 ;i<array.length ;i++){
            for(int j=i ;j<array.length ;j++){
                System.out.print("("+array[i]);
                sum = sum + array[i] ;
                for(int k=i+1 ;k<=j ;k++){
                    System.out.print(","+array[k]) ;
                    sum = sum + array[k] ;

                }
                System.out.print(")");
                System.out.println(" Sum is : " +sum);
                if(sum>max){
                    max = sum ;
                }
                sum = 0 ;
                total++ ;
            }
            System.out.println("Maximum sum of "+array[i]+"'s subarrays is : "+max);
            max = 0 ;
            System.out.println();
        }
        System.out.println("Total subarrays are : "+total);


    }
    public static void main(String[] args){
        int array[] = {2,4,6,8,10} ;
        subarray(array) ;

    }
}
