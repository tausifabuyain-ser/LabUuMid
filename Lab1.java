// import java.util.Scanner;

// public class LabOne{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the fahrenhite: ");
//         int NumInput = sc.nextInt();
        

//         double c =(NumInput-32)* 5/9;

//         System.out.println("In Celcius this will be: "+c );


//     }
// }

//Swaping two Integer with third variables

// public class LabOne {

//      public static void main(String[] args) {
//         int a = 10;
//         int b = 15;
//         int x ;

//         x=a;
//         a=b;
//         b=x;

//         System.out.println("A was initialized as 10 and b as 15 now a,b are"+a+b);

        

       
//      }
// }

//swaping without using a third variable

// public class LabOne {

//     public static void main(String[] args) {
//         int a=10;
//         int b=15;
//         a= a + b;
//         b= a - b;
//         a= a - b;

//         System.out.println("a was 10 and b was 15 .Now a an b is"+a+b);

//     }
// }



//last three digit in number in reverse order

// import java.util.Scanner;

// public class LabOne {

//     public static void main(String[] args) {
//         System.out.print("Enter your Id: ");
//         Scanner sc = new Scanner(System.in);
//         int id= sc.nextInt();

      

//         // Extract each digit separately (in reverse order)
//         int d1 = id % 10;        // rightmost digit
//          int d2 = (id / 10) % 10; // middle digit
//         int d3 = (id / 100) % 10 ;       // leftmost digit

    
//           System.out.println("Reversed digits: " + d1  + d2  + d3);

//     }
// }


//write a java program to find the area and perimeter of a rectangular and a cirle

// public class LabOne{
//     public static void main(String[] args){
//         double length = 23.8;
//         double width = 15.7;
//         double radius = 12.4;

//         double RecArea = length * width;
//         double RecPerimeter = 2 * (length * width);

//         double CiArea = Math.PI*radius*radius;
//         double CiPerimeter = 2*Math.PI*radius;

//         System.out.print("The Area of Rec is ");
//         System.out.printf("%.2f\n",RecArea);
//         System.out.print("The perimeter of Rec is ");
//         System.out.printf("%.2f\n",RecPerimeter);


//         System.out.print("The Area of Circle is ");
//         System.out.printf("%.2f\n",CiArea);
//         System.out.print("The perimeter of Circle is ");
//         System.out.printf("%.2f\n",CiPerimeter);
       



//     }
// }

// Convert Minutes to Years and Days




public class Lab1{
    public static void main(String[] args ){
        int NumOfMinutes = 3456789;
        int MinInDay= 60 * 24;
        int MinInYears = MinInDay * 365;

        int years = NumOfMinutes/MinInYears;
        int days = (NumOfMinutes%MinInYears)/MinInDay;

        System.out.println("Years "+ years);
        System.out.println("Days "+ days);
    }
}