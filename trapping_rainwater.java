import java.util.Arrays;

public class trapping_rainwater {
    public static void main(String[] args){
        // height of the blocks storing in an array and calculating the array size...
        int height[] = {4,2,0,6,3,2,5} ;
        int size = height.length ;

        // creating two arrays for calculating left and right most greater numbers...
        int left_max[] = new int[size] ;
        int right_max[] =new int[size];

        // assigning them the values...
        left_max[0] = height[0] ;
        right_max[size-1] = height[size-1] ;
        
        // creating the left max array...
        for(int i=1 ;i<size ;i++){
            if(height[i]>=left_max[i-1]){
                left_max[i] = height[i] ;
            }
            else{
                left_max[i] = left_max[i-1] ;
            }

        }
        System.out.println("Left max array is : "+Arrays.toString(left_max));

        //creating the right max array...
        for(int i=size-2 ; i>=0 ;i--){
            if(height[i]>=right_max[i+1]){
                right_max[i] = height[i] ;
            }
            else{
                right_max[i] = right_max[i+1] ;
            }
        }
        System.out.println("Right max array is : "+Arrays.toString(right_max));
        

        //calculating the water capacity of each tower...
        int water = 0 ;
        int capacity = 0 ;
        for(int i=0 ;i<size ;i++){
            capacity = Math.min(left_max[i],right_max[i]) ;
            water = water + (capacity-height[i]) ;
        }
        System.out.println("Total water that will be trapped is :"+water);

    }
}
