public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 5.0;
        double time = 5.0;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
