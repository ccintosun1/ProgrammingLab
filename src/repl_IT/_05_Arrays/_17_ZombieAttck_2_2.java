package repl_IT._05_Arrays;import java.util.Arrays;import java.util.Scanner;public class _17_ZombieAttck_2_2 {    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        int[] in = {3, 6, 0, 4, 3, 2, 7, 0};        int day = 0, c=0;        while (true) {            int sum=0;            for (int each : in) sum += each;            if (sum == 0) break;            System.out.println("Day " + day++ + " " + Arrays.toString(in));            int[] dami = Arrays.copyOf(in,in.length);            for (int i = 0; i < in.length; i++) {                if (dami[i] == 0 ) {                    if (i != 0 && c != i-1) in[i - 1] /= 2;                    if (i != in.length - 1)                    {  in[i + 1] = in[i + 1] / 2;   c=i+1; }                }            }        }        System.out.println("Day " + day++ + " " + Arrays.toString(in));        System.out.println("---- EXTINCT ----");    }}