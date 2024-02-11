import laskin.Laskin;

public class Main {

    public static void main(String[] args) {


        Laskin laskin = new Laskin();
        laskin.ON();

        laskin.add(5);
        System.out.println(laskin.getResult()); // 5

        laskin.subtract(3);
        System.out.println(laskin.getResult()); // 2

        laskin.multiply(2);
        System.out.println(laskin.getResult()); // 4

        laskin.divide(2);
        System.out.println(laskin.getResult()); // 2

        laskin.square(3);

        System.out.println(laskin.getResult()); // 9

        try {
            laskin.divide(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Division by zero is not allowed.

    }

        laskin.OFF();

}
}

