package laskin;

public class Laskin {

    private double result;

    public double getResult() {
        return result;
    }

    public void add(int number) {
        result += number;
    }

    public void subtract(int number) {
        result -= number;
    }

    public void multiply(int number) {
        result *= number;
    }

    public void divide(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        result /= number;
    }

    public void square(int number) {
        result = number * number;
    }

    public void ON() {
        result = 0;
    }

    public void OFF() {

    }
    
}