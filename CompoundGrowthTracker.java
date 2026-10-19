public class CompoundGrowthTracker {
    public static void main(String[] args) {
        double balance = 1000;

        balance += 100;
        System.out.println("After Step 1: " + balance);

        balance *= 2;
            System.out.println("After Step 2: " + balance);

        balance -= 50;
        System.out.println("After Step 3: " + balance);

        int count = 5;
            System.out.println("Postfix: " + count++);
        System.out.println("After Postfix: " + count);

        System.out.println("Prefix: " + ++count);
        
    }
}
