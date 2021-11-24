package com.oxyl;

public class PlayWithString {

    public static void main(String[] args) {
        String numbers = """
                    one     \s
                two    \
                three
                four
                """;

        numbers.lines()
                .map(s -> "|"+s+"|")
                .forEach(System.out::println);
    }
}
