public class stocks {
    public static void main(String[] args){
        int price[] = {7,1,5,3,6,4} ;
        int buy_price = price[0] ;
        int sell_price = price[0] ;
        int profit = 0 ;
        int max_profit = 0 ;

        for(int i=1 ;i<price.length ;i++){
            sell_price = price[i] ;
            profit = sell_price - buy_price ;
            System.out.println("For day "+(i+1)+" buy price  :"+buy_price) ;
            System.out.println("For day "+(i+1)+" sell price is :"+sell_price) ;
            System.out.println("Profit for day "+(i+1)+" is : "+profit);

            System.out.println();
            System.out.println();
            
            if(profit>max_profit){
                max_profit = profit ;
            }
            if(price[i]<buy_price){
               buy_price = price[i] ;
            }
            
        }
        System.out.println("Max profit is : "+ max_profit);
    }
}
