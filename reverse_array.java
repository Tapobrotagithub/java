import java.util.Arrays;

public class reverse_array {

    public static void reverse(int array[]){
        int start = 0 ;
        int end = array.length-1 ;
        int temp = 0;
        while(start<=end){
            temp = array[start] ;
            array[start] = array[end] ;
            array[end] = temp ;
            start++ ;
            end-- ;

        }
        System.out.println("Reversed array is : "+Arrays.toString(array)) ;

       
    }
    public static void main(String[] args){
        int array[] = {7,6,5,4,3,2,1} ;
        System.out.println("before array is : "+Arrays.toString(array));
        reverse(array) ;
    }
}
