public class array_pair {
    public static void pair(int array[]){
        for(int i=0 ;i<array.length ;i++){
            int element = array[i] ;
            for(int j=i+1 ;j<array.length ;j++){
                System.out.print("("+element+","+array[j]+")");
            } 
            System.out.println() ;

        }

    }
    public static void main(String[] args){
        int array[] = {2,4,6,8,10} ;
        pair(array) ;
    }
}
