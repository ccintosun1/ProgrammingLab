package repl_IT._05_Arrays;import java.util.Arrays;public class _14_ShortestWord {    public static void main(String[] args) {        String str = ("olive, fish, pursuit, old, warning, python, java, coffee, cat, ray");        String[] arr = str.split(", ");        int shortest = arr[0].length();        String strNew = "";        for (int i = 1; i < arr.length; i++) {            if (arr[i].length() <= shortest) {                shortest = arr[i].length();            }        }        for (int i = 0; i < arr.length; i++) {            if (arr[i].length() == shortest) {                strNew += arr[i] + " ";            }        }        String[] arrNew = strNew.split(" ");        System.out.println(Arrays.toString(arrNew));    }}/*### Given a `String` `str`, find and print the shortest words. The `String` will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:> Input: word1, word2, word3, word4, etc...> Output: [short1, short2, short3, etc...]Hint: Think about what comes between each word in the sentenceMain topics: arrays, String, loops, if statements, primitive datatypes, operatorsExample:```Input:  olive, fish, pursuit, old, warning, python, java, coffee, cat, rayOutput:  [old, cat, ray]``` */