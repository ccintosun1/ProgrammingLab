package repl_IT._06_Methods;

import java.util.Scanner;

public class _02_Sign {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sign(n));

    }

    public static String sign(int n) {

        String result = "";

        if (n > 0) {
            result = "positive";
        } else if (n < 0) {
            result = "negative";
        }else {
            result = "zero";
        }

        return result;
    }

}

/*
### Finish the given method `sign()` to print if the number is a positive number,
negative number, or zero. The `sign()` method is already called in the main method
and is also given an argument `n`. The value of `n` is coming from a Scanner input,
but should be treated as just a number.

#### This is a `void` method with an `int` parameters

Main topics: methods, Scanner, primitive datatypes, if statements, operators

Example:
```
  sign(5)

output:
  positive
```
Example:
```
  sign(-30)

output:
  negative
```
Example:
```
  sign(0)

output:
  zero
```
 */