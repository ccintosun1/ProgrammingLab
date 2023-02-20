package repl_IT._05_Arrays;import java.util.Scanner;public class _06_FirstAndLastCharacterOfWord {    public static void main(String[] args) {        //DO NOT TOUCH BELOW:        Scanner input = new Scanner(System.in);        String[] words = {"hello", "why", "by", "apple" , "note"};        for (String each : words) {            System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));        }    }}/*### Given a `String []` `words` print the first and last character of each String element in the array. Print the first and last character in the same line with no spaces.#### Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, StringExample:```Input:  ["hello", "why", "by", "apple" , "note"]Output:  ho  wy  by  ae  ne``` */