public class FRQSolutions
{
    public FRQSolutions() {}

    public void printNums(int value, int numRounds)
    {
        for(int i = 0; i < numRounds; i++)
        {
            String numbersPrinted = "";
            boolean isValue = false;
            while(!isValue)
            {
                int number = (int) (Math.random() * 10);
                numbersPrinted = numbersPrinted + number;
                if(number == value)
                {
                    isValue = true;
                }
            }
            System.out.println(numbersPrinted);
        }
    }

    public String longestStreak(String str)
    {
        String consecutiveIdenticalCharacter = "";
        int streakLength = 0;
        for(int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            int streak = 1;
            String characterAfter = "";
            for(int j = i + 1; j < str.length(); j++)
            {
                if (j == str.length()) {
                    characterAfter = str.substring(j);
                } else {
                    characterAfter = str.substring(j, j + 1);
                }
                if (characterAfter.equals(character)) {
                    streak++;
                } else {
                    j = str.length();
                }
            }
            if (streak > streakLength) {
                consecutiveIdenticalCharacter = character;
                streakLength = streak;
            }
        }
        return(consecutiveIdenticalCharacter + " " + streakLength);
    }
}
