/*
Vivian Peng
11/02/2023
CCC 2021 Junior Q2 "Silent Auction"
 */
import java.util.Scanner;

public class CCC2021J2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numBids, bid, winningBid = -1;
        String bidder, winningBidder = "";

        numBids = scanner.nextInt();

        for(int i = 0; i < numBids; i++){
            bidder = scanner.next();
            bid = scanner.nextInt();

            if(bid > winningBid) {
                winningBid = bid;
                winningBidder = bidder;
            }
        }

        System.out.print(winningBidder);
    }
}
