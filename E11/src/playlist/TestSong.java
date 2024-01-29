package playlist;

import java.util.Arrays;

public class TestSong
{
    public static void main(String[] args) {
        Song[] arr = {
                new Song("Enemy", "Imagine dragons", 4),
                new Song("Black Dahlia", "Hollywood Undead", 5),
                new Song("Poison", "Blake Roman", 2),
                new Song("Everything Black", "Unlike Pluto", 3),
                new Song("R U mine?", "Arctic Monkeys", 3)
        };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("After sorting:\n" + Arrays.toString(arr));
    }
}
