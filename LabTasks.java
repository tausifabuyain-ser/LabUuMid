import java.util.Scanner;

public class LabTasks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Lab Task Menu ===");
            System.out.println("3. Sum of multiples of 7 or 9 (up to 600)");
            System.out.println("4. Print divisors of a number");
            System.out.println("5. Count number of digits");
            System.out.println("6. Check palindrome number");
            System.out.println("7. Check prime number");
            System.out.println("8. Check perfect number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 3:
                    sumMultiples();
                    break;
                case 4:
                    printDivisors();
                    break;
                case 5:
                    countDigits();
                    break;
                case 6:
                    checkPalindrome();
                    break;
                case 7:
                    checkPrime();
                    break;
                case 8:
                    checkPerfect();
                    break;
                case 0:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);
    }

    // Task 3: Sum of numbers that are multiples of 7 or 9
    public static void sumMultiples() {
        int sum = 0;
        for (int i = 1; i <= 600; i++) {
            if (i % 7 == 0 || i % 9 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of numbers (multiples of 7 or 9 up to 600): " + sum);
    }

    // Task 4: Print divisors and count them
    public static void printDivisors() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        System.out.println("Divisors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total Divisors: " + count);
    }

    // Task 5: Count digits in a number
    public static void countDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = Math.abs(num);
        if (temp == 0) count = 1;
        else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }

    // Task 6: Check palindrome
    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }

    // Task 7: Check prime number
    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    // Task 8: Check perfect number
    public static void checkPerfect() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        if (sum == num)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");
    }
}
