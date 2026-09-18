
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Espresso", "Sabrina Carpenter", 175));
        songs.add(new Song("Birds of a Feather", "Billie Eilish", 211));
        songs.add(new Song("Born in the USA", "Bruce Springsteen", 284));
        songs.add(new Song("Wrecking Ball", "Miley Cyrus", 222));

        System.out.println("Antal låtar: " + songs.size());

        for (Song song : songs) {
            System.out.println(song);
        }

        System.out.println("\nLåtar som är längre än 4 minuter:");
        for (Song song : songs) {
            if (song.isLongSong()) {
                System.out.println(song);
            }
        }
    }
    }
