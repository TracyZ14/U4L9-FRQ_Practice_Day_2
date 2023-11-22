public class CoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int roundTracker = 1; // *** ADDED TO ENABLE TESTING ***

    public CoinGame(int s, int r)
    {
        startingCoins = s;
        maxRounds = r;
    }


    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
     * NOTE: THIS CODE WAS NOT PROVIDED IN THE FRQ ("implementation not shown")
     *       BUT IS INCLUDED HERE TO ENABLE TESTING
     */
    public int getPlayer1Move()
    {
        int result;
        if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
        } else if (roundTracker == 3) {
            result = 1;
        } else {
            result = 3;
        }
        roundTracker++;
        return result;
    }


    /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
     * as described in part (a).
     */
    public int getPlayer2Move(int round)
    {
        if((round % 3) == 0)
        {
            return 3;
        }
        else if((round % 2) == 0)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }


    /** Plays a simulated game between two players, as described in part
     * (b).
     */
    public void playGame()
    {
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        for(int i = 1; ((i <= maxRounds) && (player1Coins >= 3) && (player2Coins >= 3)); i++)
        {
            int player1Spends = getPlayer1Move();
            int player2Spends = getPlayer2Move(i);
            player1Coins = player1Coins - player1Spends;
            player2Coins = player2Coins - player2Spends;
            if(player1Spends == player2Spends)
            {
                player2Coins++;
            }
            if(Math.abs(player1Spends - player2Spends) == 1)
            {
                player2Coins++;
            }
            if(Math.abs(player1Spends - player2Spends) == 2)
            {
                player1Coins = player1Coins + 2;
            }
        }
        if(player1Coins > player2Coins)
        {
            System.out.println("player 1 wins");
        }
        else if(player2Coins > player1Coins)
        {
            System.out.println("player 2 wins");
        }
        else
        {
            System.out.println("tie game");
        }
    }
}