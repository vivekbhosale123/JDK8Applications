package Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordApplication {

    static void main(String[] args) {

        String s="java full stack java development";
        Map<String,Long> map= Arrays.asList(s.toLowerCase().split(" ")).stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.forEach((k,v)->{
            if(v>1)
            {
                IO.println(k+" "+v);
            }
        });

    }

}
