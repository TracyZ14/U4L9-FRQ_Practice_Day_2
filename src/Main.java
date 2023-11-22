public class Main {
    public static void main(String[] args)
    {
        FRQSolutions frq = new FRQSolutions();

        frq.printNums(5, 4);
        System.out.println(); // print a blank line after test case
        frq.printNums(7, 3);  // three lines all ending in 7
        System.out.println(); // blank line
        frq.printNums(1, 8);  // eight lines all ending in 1
        System.out.println(); // blank line
        frq.printNums(9, 10); // ten lines all ending in 9

        System.out.println(frq.longestStreak("CCAAAAATTT!"));  //should print: A 5
        System.out.println(frq.longestStreak("CCCCAAATTT!"));  //should print: C 4
        System.out.println(frq.longestStreak("CCCAATTT!"));    //should print: C 3
        System.out.println(frq.longestStreak("CCCCAATTTTTT!"));//should print: T 6
        System.out.println(frq.longestStreak("cbbaaabbmgg"));  //should print: a 3
        System.out.println(frq.longestStreak("cbbaaabbggg"));  //should print: a 3

        CoinGame game1 = new CoinGame(10, 5);
        game1.playGame();  // should print: tie game
        CoinGame game2 = new CoinGame(10, 4);
        game2.playGame(); // should print: tie game
        CoinGame game3 = new CoinGame(10, 3);
        game3.playGame(); // should print: player 1 wins
        CoinGame game4 = new CoinGame(10, 2);
        game4.playGame(); // should print: player 2 wins
        CoinGame game5 = new CoinGame(10, 6);
        game5.playGame(); // should print: player 2 wins
        CoinGame game6 = new CoinGame(5, 4);
        game6.playGame(); // should print: player 2 wins
        CoinGame game7 = new CoinGame(7, 4);
        game7.playGame(); // should print: tie game
    }
}