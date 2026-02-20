public class factorial {
    int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int number = 5;       
        factorial obj = new factorial();
        int result = obj.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
