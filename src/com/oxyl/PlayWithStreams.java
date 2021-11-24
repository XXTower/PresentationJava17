package com.oxyl;

import java.util.List;
import java.util.stream.Stream;

public class PlayWithStreams {

    public static void main(String[] arg){

        var listOf = List.of(
                "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"
        );

        var count = listOf.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .count();
        System.out.println("count = " +count);

        String ints = """
                1
                2
                3
                """;
        var list = ints.lines()
                .map(Integer::parseInt)
                .toList();


        //pas un racourci de collect(Collector.toList) car créer direct un tableau asser grand
        // retourne list non modifiable + accepte valeur null

    }

    static void exep(){
        String ints = """
                1
                2
                3
                4
                chaine de caractere
                5
                6
                7
                8
                9
                """;
        var list = ints.lines()
                .filter(s->{
                    try {
                        Integer.parseInt(s);
                        return true;
                    }catch (NumberFormatException nfe){
                        return false;
                    }
                })
                .map(Integer::parseInt)
                .toList();


        var list1 = ints.lines()
                .flatMap(
                        s -> {
                            try {
                                return Stream.of(Integer.parseInt(s));
                            }catch (NumberFormatException nfe){
                                return Stream.empty();
                            }
                        }
                )
                .toList();

        //new 17

        var list2 = ints.lines()
                .mapMulti(
                        (s,stream) -> {
                            try {
                                stream.accept(Integer.parseInt(s));
                            }catch (NumberFormatException nfe){
                            }
                        }
                )
                .toList();
    }
}
