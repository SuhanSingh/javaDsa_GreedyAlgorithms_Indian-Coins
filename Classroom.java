import java.util.*;
public class Classroom {
    public static void main(String args[]) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int Amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= Amount) {
                while(coins[i] <= Amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    Amount -= coins[i];
                }
            }
        }

        System.out.println("total (min) coins used = " + countOfCoins);

        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
// total (min) coins used = 4
// 500 50 20 20