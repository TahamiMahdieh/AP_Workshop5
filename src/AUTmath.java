public class AUTmath {

    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static int subtract(int num1,int num2){
        return num1-num2;
    }
    public static int multiply(int num1,int num2){
        return num1*num2;
    }
    public static int divide(int num1,int num2){
        return num1/num2;
    }
    public static int factorial(int number){
        int total = 1;
        for (int i = number; i > 0 ; i--) {
            total*=i;
        }
        return total;
    }
    public static int pow(int base,int power){
        int total = 1;
        for (int i = 0; i < power; i++) {
            total*=base;
        }
        return total;
    }
}
