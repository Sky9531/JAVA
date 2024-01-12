public class SwapWithVariable {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
