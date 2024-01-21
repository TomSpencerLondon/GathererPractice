package com.tomspencerlondon;

import static java.lang.StringTemplate.STR;

import java.util.List;
import java.util.function.Predicate;

public class CustomGatherers {

  public static void main(String[] args) {
    var letters = List.of("A", "B", "C", "D", "B", "C", "F", "E");

    Predicate<String> isEven = letter -> ((int) letter.charAt(0)) % 2 == 0;

    var result = letters.stream()
        .filter(isEven)
        .toList();

    System.out.println(STR."""

        in: \{letters}
        out: \{result}
        """);
  }

}
