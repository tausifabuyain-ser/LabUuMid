// public class Lab3 {
//     public static void main(String[] args) {
//         for(int i=18;i<66;i+=9){
//             System.out.print(i+",");
//         }
//     }
// }

//printing something using loop
public class Lab3 {
    public static void main(String[] args) {
        for(int i=18;i<66;i+=9){
            if(i % 2 == 0){
                System.out.print(i+",");

            }else{
               
                 System.out.print(i*-1+",");
            }
            
        }
    }
}
