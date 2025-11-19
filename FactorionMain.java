import java.util.Scanner;

public class FactorionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Factorion numbers in the range:");
        boolean found = false;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (FactorionUtil.isFactorion(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No factorion numbers found in the given range.");
        }

        scanner.close();
    }
}
