public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int a = 100, b = 10, result = 0;

        result+= add(a,b);
        result+= dif(a,b);
        result+= div(a,b);
        result+= times(a,b);

        return result;
    }
}

