package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class DistinctCharacterApplication {

    static void main(String[] args) {
        String name = "Swara";

        Stream.of(name).map(w->w.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

    }

}
