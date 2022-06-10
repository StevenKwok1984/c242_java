public class Expressions {
    public static void main(String[] args) {
        // Declare variables to use in the examples
        int result;
        int operand1;
        int operand2;
        int operand3;

        //
        // Assignment
        //
        // Initialize result with the value of 0 by using the
        // assignment (=) operator. The assignment operator takes the
        // value on the right and assigns it to the variable on the
        // left
        result = 0;// now result has the value of 0

        // Initialize the operands
        operand1 = 5;
        operand2 = 7;

        // Assignment works with variable values as well as literal
        // values. We'll set operand3 to the same value as operand2
        operand3 = operand2;

        /*
            Addition
         */
        // Addition is a binary infix operator. Tt works with
        // literals:
         result = 42 + 53;  // result is now 95

        // It also works with variables:
        result = operand1 + operand2;

        // It works with a combination of literals and variables:
        result = 1 + operand1;  // result now equals 6

        // You can chain addition operators together:
        // result now equals 20
        result = 1 + operand1 + operand2 + operand3;

        /*
            Finally, the += operator is used to add a value to a
            variable. result += operator1 is equivalent to
            result = result + operand1
             NOTE: the initial value of result is used to calculate the
             new value of result:
         */
        result = 2; // set result to 2
        result += 4; // result is now equal to 6 (2+4)
        result += operand1; // result

        //
        // Subtraction
        //
        // Subtraction is a binary infix operator.  It works with
        // literals:
        result = 9 - 5;  // result is now 4

        // It laso works with variables:
        result = operand1 - operand2;  // result now equals -2
        System.out.print(result);

        //
        //
        //
    }
}
