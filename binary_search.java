public class binary_search {
    public static int searching(int arr[] ,int key){
        int start = 0 ;
        int end = arr.length-1 ;

        while(start<= end){
            int mid = (start+end) /2 ;
            
            if(key == arr[mid]){
            return mid ;
            }
           else if(key > arr[mid]){
            start = mid+1 ;
            }
            else if(key<arr[mid]){
            end = mid-1 ;
            }
            

        }

        return -1 ;

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} ;
        int key =7 ;
        int index = searching(arr,key) ;
        if(index == -1){
            System.out.println("Iten not found ") ;

        }
        else{
            System.out.println("Item found at index :" +index) ;
        }
        

    }
}
