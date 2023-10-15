public class subarray_pair {
    public static void subarray(int array[]){
        int total = 0 ;
        for(int i=0 ;i<array.length ;i++){
            for(int j=i ;j<array.length ;j++){
                System.out.print("("+array[i]);
                for(int k=i+1 ;k<=j ;k++){
                    System.out.print(","+array[k]) ;
                }
                System.out.print(")");
                total++ ;
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : "+total);


    }
    public static void main(String[] args){
        int array[] = {2,4,6,8,10} ;
        subarray(array) ;

    }
}
