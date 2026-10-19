public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        int a = 5, b = 2;
        int x = 3;
        
        System.out.println("Expression 1: " + (a + b * x));
        
        System.out.println("Expression 2: " + (a > b && x < 4));

        System.out.println("Expression 3: " + (x++ + 2 == 5));
    }
}

