package Stream;

import java.util.stream.IntStream;

public class PrimeNumberUsingStreamApi {

    static void main(String[] args) {

        int n=2;

        System.out.println(IntStream.rangeClosed(2, n/2).noneMatch(i->i%2==0));

    }

}
