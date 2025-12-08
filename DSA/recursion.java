public class recursion {
    long factorial(int n) {
        if (n <= 1) {
            return 1;
        } 
        else {
            return n * factorial(n - 1); 
        }
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void counting(int n) {
        if (n == 0) {
            System.out.println(n);
            return; 
        }        
        counting(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        recursion obj = new recursion(); 
        
        int inputNumber = 8;
        
        long result = obj.factorial(inputNumber);
        System.out.println("The factorial of " + inputNumber + " is: " + result);

        int resultFib = obj.fibonacci(inputNumber);
        System.out.println("The " + inputNumber + "th Fibonacci number is: " + resultFib);

        System.out.println("\nStarting the countdown:");
        obj.counting(5); 
    }
}
