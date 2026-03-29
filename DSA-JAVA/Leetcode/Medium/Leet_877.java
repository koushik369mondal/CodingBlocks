package Leetcode.Medium;

public class Leet_877 {
    public static void main(String[] args) {
        int[] piles = {5, 3, 4, 5};
        Leet_877 obj = new Leet_877();
        System.out.println(obj.stoneGame(piles));
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int alice = 0;
        int bob = 0;
        int i = 0, j = n - 1;
        while (i <= j) {
            if (piles[i] >= piles[j]) {
                alice += piles[i];
                i++;
            } else {
                alice += piles[j];
                j--;
            }
            if (piles[i] >= piles[j]) {
                bob += piles[i];
                i++;
            } else {
                bob += piles[j];
                j--;
            }
        }
        return alice > bob;
    }
}
