class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    double div() {                
        if (b > 0) {
            return (double) a/b;  
        } else {
            return -1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(149, 20);
        System.out.println("Division " + calc.div());  // Prints 0.5
    }
}
