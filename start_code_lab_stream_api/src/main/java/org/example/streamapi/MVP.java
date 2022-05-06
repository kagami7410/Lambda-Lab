package org.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
         names.stream().forEach(name -> System.out.println(name));

    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {

        // Implement me :)
        return numbers.stream().filter(number -> (number %2 == 0)).toList();
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {

       return Arrays.stream(numbers).map(num -> num*2).toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        return Arrays.stream(input.toUpperCase().split("")).toList();
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        List<String>filteredAnimals = list.stream().filter(animal -> animal.startsWith(letter)).sorted().map(animal -> animal.toUpperCase()).toList();
        return filteredAnimals;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        return words.stream().filter(word-> word.length() < maxLength && word.startsWith(firstLetter)).toList();
    }
}