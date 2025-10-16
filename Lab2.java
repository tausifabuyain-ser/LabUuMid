// public class Lab2{
//     public static void main(String[] args) {
//        double regPayHour=8.25;
//        double overPayHour = 8.25 * 1.5;

//        int TotalWork=47;

//         double regPay = 40 * regPayHour;
//        int OverTime = TotalWork - 40;
//         double TotalPay = regPay + (OverTime * overPayHour);

//         System.out.println("The total paymet :$"+ TotalPay);

//     }
// }

//calculating the flim ticket prize

// import java.util.Scanner;

// public class Lab2 {
//     public static void main(String[] args) {
//         System.out.print("Enter age: ");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.print("If Weekends enter 1 otherwise 0:");
//         int Check = sc.nextInt();

//         if (age < 13) {
//             if (Check == 1) {
//                 System.out.println("It's Weekend kiddo,Pay $120");

//             } else {
//                 System.out.println("It's not a Weekend kiddo,Pay $100");
//             }
//         }else if(age<65){
//             if(Check == 1){
//                 System.out.println("It's a weekend mate, pay $180");
//             }else{
//                  System.out.println("It's not a weekend mate, pay $150");
//             }
//         }else{
//             if(Check == 0){
//                 System.out.println("It's a weekend sir, pay $150");
//             }else{
//                 System.out.println("It's not a weekend sir, pay $130");
//             }

//         }
//     }
// }

//find Out the cgpa

// import java.util.Scanner;

// public class Lab2{
//     public static void main(String [] args){
//         System.out.print("Enter ther first course mark out of 15 ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println("Enter ther first course mark out of 15: ");

//         int b = sc.nextInt();
//         System.out.println("Enter ther first course mark out of 15: ");

//         int c = sc.nextInt();
//         System.out.println("Enter ther first course mark out of 15: ");

//         int d = sc.nextInt();
//         System.out.println("Enter ther first course mark out of 15: ");

//         int e = sc.nextInt();

//         int allMarks= a+b+c+d+e;

//         double percentage = (allMarks*100)/75;

//         System.out.println("The percentage is: "+ percentage);

//     }
// }

//Printing price

// import java.util.Scanner;

// public class Lab2 {
//     public static void main(String[] args) {
//         System.err.println("Enter the number of print: ");
//         Scanner sc = new Scanner(System.in);
//         int inputNum = sc.nextInt();

//         if (inputNum < 100) {
//             System.out.println("The total num of print is " + inputNum);
//             double TotalPrize = inputNum * 0.30;
//             System.out.println("The total Prize is :$ " + TotalPrize);

//         } else if (inputNum < 500) {
//             System.out.println("The total num of print is " + inputNum);
//             double PrizeForHundred = 99 * 0.30;
//             int remaining = inputNum - 99;
//             double TotalPrize = PrizeForHundred + (remaining * 0.28);
//             System.out.println("The total Prize is :$ " + TotalPrize);

//         } else if (inputNum < 800) {
//             System.out.println("The total num of print is " + inputNum);
//             double PrizeForHundred = 99 * 0.30;
//             double PrizeForFiveHundred = 400 * 0.28;

//             int remaining = inputNum - 499;
//             double TotalPrize = PrizeForHundred + PrizeForFiveHundred + (remaining * 0.27);
//             System.out.println("The total Prize is :$ " + TotalPrize);

//         } else if (inputNum <= 1000) {
//             System.out.println("The total num of print is " + inputNum);
//             double PrizeForHundred = 99 * 0.30;
//             double PrizeForFiveHundred = 400 * 0.28;
//             double PrizeForEightHundred = 300 * 0.27;

//             int remaining = inputNum - 799;
//             double TotalPrize = PrizeForHundred + PrizeForFiveHundred + PrizeForEightHundred + (remaining * 0.26);
//             System.out.println("The total Prize is :$ " + TotalPrize);

//         } else if (inputNum > 1000) {
//             System.out.println("The total num of print is " + inputNum);
//             double PrizeForHundred = 99 * 0.30;
//             double PrizeForFiveHundred = 400 * 0.28;
//             double PrizeForEightHundred = 300 * 0.27;
//             double PrizeForOneThousands = 201 * 0.26;

//             int remaining = inputNum - 1000;
//             double TotalPrize = PrizeForHundred + PrizeForFiveHundred + PrizeForEightHundred + PrizeForOneThousands
//                     + (remaining * 0.25);
//             System.out.println("The total Prize is :$ " + TotalPrize);

//         }
//     }
// }

// import java.util.Scanner;

// public class Lab2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of copies to print: ");
//         int copies = sc.nextInt();

//         double pricePerCopy;

//         if (copies <= 99) {
//             pricePerCopy = 0.30;
//         } else if (copies <= 499) {
//             pricePerCopy = 0.28;
//         } else if (copies <= 799) {
//             pricePerCopy = 0.27;
//         } else if (copies <= 1000) {
//             pricePerCopy = 0.26;
//         } else {
//             pricePerCopy = 0.25;
//         }

//         double totalPrice = copies * pricePerCopy;

//         System.out.println("Number of copies: " + copies);
//         System.out.println("Price per copy: $" + pricePerCopy);
//         System.out.println("Total price: $" + totalPrice);
//     }
// }

// TaxCalculator.java
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        double tax = 0;

        if (age < 18) {
            tax = 0;
        } else {
            if (income < 10000)
                tax = 0;
            else if (income <= 20000)
                tax = income * 0.05;
            else
                tax = income * 0.10;
        }

        System.out.println("Your calculated tax is: $" + tax);
        
        // sc.close();
    }
}
