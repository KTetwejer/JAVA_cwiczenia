package games;

import java.util.Arrays;

public class VideoGame implements Comparable<VideoGame>
{
    private String name;
    private String developer;
    private float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public int compareTo(VideoGame o) {
        return o.name.length() - this.name.length();
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        VideoGame[] arr = {new VideoGame("some name", "Developer 1", 1.0f),
                new VideoGame("short", "Developer 2", 2.0f),
                new VideoGame("very long long name", "Developer 3", 3.0f)
        };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
