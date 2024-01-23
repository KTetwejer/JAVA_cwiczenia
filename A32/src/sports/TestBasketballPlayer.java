package sports;

import java.util.Arrays;

public class TestBasketballPlayer
{
    public static void main(String[] args) {
        BasketballPlayer player1 = new BasketballPlayer("Michael Jordan", new int[] {1, 2, 3, 4, 5});
        try {
            BasketballPlayer player2 = (BasketballPlayer) player1.clone();
            System.out.println(Arrays.toString(player1.getPoints()));
            System.out.println(Arrays.toString(player2.getPoints()));
            player1.setPointsAtIndex(0, 6);
            System.out.println(Arrays.toString(player1.getPoints()));
            System.out.println(Arrays.toString(player2.getPoints()));
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
