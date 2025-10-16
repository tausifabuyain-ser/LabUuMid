// public class Lab3 {
//     public static void main(String[] args) {
//         for(int i=18;i<66;i+=9){
//             System.out.print(i+",");
//         }
//     }
// }

//printing something using loop
// public class Lab3 {
//     public static void main(String[] args) {
//         for(int i=18;i<66;i+=9){
//             if(i % 2 == 0){
//                 System.out.print(i+",");

//             }else{
               
//                  System.out.print(i*-1+",");
//             }
            
//         }
//     }
// }

  // Task 3: Sum of numbers that are multiples of 7 or 9

  public class Lab3 {
  
    public static void main(String[] args) {
        int sum =0;

        for(int i =1; i<=600;i++){
            if(i % 7 == 0 || i%9 == 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
  }

// import java.util.Scanner;

// public class Lab3{
//     public static void main() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int sum = 0;

//         for (int i = 1; i < num; i++) {
//             if (num % i == 0)
//                 sum += i;
//         }

//         if (sum == num)
//             System.out.println(num + " is a perfect number.");
//         else
//             System.out.println(num + " is not a perfect number.");
//     }
// }

