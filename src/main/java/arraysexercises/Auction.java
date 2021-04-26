package arraysexercises;

public class Auction {


    public int priceIsRight(int[] bids, int price) {
        int closestPrice = -1;
        for (int bid : bids) {
            if (bid > closestPrice && bid <= price){
                closestPrice = bid;
            }
        }
        return closestPrice;
    }
}
