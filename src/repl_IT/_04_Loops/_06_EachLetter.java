package repl_IT._04_Loops;import java.util.Scanner;public class _06_EachLetter {    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        String word = input.nextLine();        for (int i = 0; i < word.length(); i++) {           char word1 =  word.charAt(i);            System.out.println(word1);        }        /*        ### Use a `loop` to print each letter of the given `word` on a separate lineMain topics: loops, primitive datatypes, operators, Scanner, String```Ex:  Input:    hello  Output:    h    e    l    l    o``````Ex:  Input:    Zimbabwe  Output:    Z    i    m    b    a    b    w    e```         */    }}