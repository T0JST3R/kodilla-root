package good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreStreamer {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(d -> d.getValue().stream())
                .collect(Collectors.joining("! \n"));

        System.out.println(result);
    }
}