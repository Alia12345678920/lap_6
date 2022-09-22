public class Q1_Test {
    public static void main(String[] args) {
        Q1 alia = new Q1(1000,10);
        alia.waitForBalance(1000000);
        System.out.println("your balance will be million after " +alia.getYear());
    }
}

