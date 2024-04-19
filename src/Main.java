import java.util.Scanner;

public class Main {
    public static void asserting (int res, int expectedRes){
        if (res != expectedRes)
            System.exit (1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your operation: ");
        int operand1 = input.nextInt();
        String operator = input.next();
        int operand2 = 0;
        if (!operator.equals("!"))
            operand2 = input.nextInt();
        if (operator.equals("+")){
            int AUT_mathResult = AUTmath.sum(operand2, operand1);
            asserting(AUT_mathResult, Integer.sum(operand2, operand1));
            System.out.println("result is = " + AUT_mathResult);
        }
        else if (operator.equals("-")){
            int AUT_mathResult = AUTmath.subtract(operand1, operand2);
            asserting(AUT_mathResult, Math.subtractExact(operand1, operand2));
            System.out.println("result is = " + AUT_mathResult);
        }
        else if (operator.equals("*")){
            int AUT_mathResult = AUTmath.multiply(operand1, operand2);
            asserting(AUT_mathResult, Math.multiplyExact(operand1, operand2));
            System.out.println("result is = " + AUT_mathResult);
        }
        else if (operator.equals("/")){
            int AUT_mathResult = AUTmath.divide(operand1, operand2);
            asserting(AUT_mathResult, Integer.divideUnsigned(operand1 , operand2));
            System.out.println("result is = " + AUT_mathResult);
        }
        else if (operator.equals("!")){
            int AUT_mathResult = AUTmath.factorial(operand1);
            int i = 1;
            for (int j = 1; j <= operand1; j ++)
                i *= j;
            asserting(AUT_mathResult, i);
            System.out.println("result is = " + AUT_mathResult);
        }
        else if (operator.equals("^")){
            int AUT_mathResult = AUTmath.pow(operand1, operand2);
            asserting(AUT_mathResult, (int) Math.pow((double) operand1, (double) operand2));
            System.out.println("result is = " + AUT_mathResult);
        }
    }
}