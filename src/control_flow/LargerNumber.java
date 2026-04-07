package control_flow;

public class LargerNumber {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int largerNumber = 0;

        if (number1 > number2 && number1 > number3) {
            largerNumber = number1;
        } else if (number2 > number3) {
            largerNumber = number2;
        } else {
            largerNumber = number3;
        }

        System.out.println(largerNumber);

    }
}
