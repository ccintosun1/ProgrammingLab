package repl_IT._06_Methods;

public class _01_WaterTax {

}

//### Finish the method called `waterTax()` that will take a `double` `units` argument and returns a `double` bill cost. Use the given guidelines to calculate the bill cost based on the number of used units. The more water used, the more it will cost. The method is already called in the main method with arguments.
//
//        ```
//        - If the units are under 50:
//        bill = units * 0.60
//
//        - If the units are above 50:
//        bill = units * 0.90
//
//        - If the units are above 100:
//        the bill is the same as the above 50 units, but with an additional fee of $50
//
//        - If the units are above 150:
//        the bill is the same as the above 50 units, but with an additional fee of $100
//        ```
//
//        #### This is a `return` method with a `double` parameter
//
//        Main topics: methods, Scanner, primitive datatypes, operators, if statements
//
//        Example:
//        ```
//        waterTax(50)
//
//        output:
//        30.0
//        ```
//        Example:
//        ```
//        waterTax(55)
//
//        output:
//        49.5
//        ```
//        Example:
//        ```
//        waterTax(151)
//
//        output:
//        235.9
