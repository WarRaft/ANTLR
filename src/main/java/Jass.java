// https://github.com/antlr/antlr4/blob/master/doc/java-target.md

import java.util.stream.Stream;

public class Jass {
    public static void main(String[] args) {
        Stream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(System.out::println);
    }
}
