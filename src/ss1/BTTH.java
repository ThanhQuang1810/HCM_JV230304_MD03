package src.ss1;

//btth1
// import java.util.Date;
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("hello world");
//     Date date = new Date();
//     System.out.println("time now"+ date);
    
// }
// }

//btth2
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int i = 10 ;
//         float f = 20.5f;
//         boolean b = true;
//         char c = 'a';
//         String s ="bình thuận";
// System.out.println("i = "+i);
// System.out.println("f = "+f);
// System.out.println("b = "+b);
// System.out.println("c = "+c);
// System.out.println("s = "+s);

//     }
// }

//btth3:
// import java.util.Scanner;
// public class Main {
//   public static void main(String[] args) { 
//     float width; //Khai báo biến chiều rộng float 
//    float height; //Khai báo biến chiều cao
//     Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scaner để thực hiện các chức năng nhập Liêu trong JAVA CORE 
    
//     System.out.println("Enter width: ");
//     width = scanner.nextFloat(); // Nhập chiều rộng System.out.println("Enter height: ");
//     System.out.println("Enter height: ");
//     height = scanner.nextFloat(); //Nhập chiều cao

//     float area = width * height; //Khai báo biến area đồng thời tính diện tích 
//     System.out.println("Area is: "+area); //In ra kết quả diện tích của hình
//   }
// }

// //btth4:
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
// 	// write your code here
//         System.out.println("Linear Equation Resolver");
//         System.out.println("Given a equation 'a * x + b = c', please enter constants:");
//         Scanner scanner = new Scanner(System.in);
//         System.out.println(" Enter a: ");
//         double a = scanner.nextDouble();
//         System.out.println("Enter b: ");
//         double b = scanner.nextDouble();
//         System.out.println("Enter c: ");
//         double c = scanner.nextDouble();
//         if(a!=0){ //Nếu a khác 0
//             double x = (c-b)/a; //Phương trình có nghiệm duy nhất x = (c-b)/a
//             System.out.println("Equation pass with x = "+x);
//         } else { // Trường hợp a = 0;
//             if(b==c){ // Nếu b = c -> Phương trình có vô số nghiệm
//                 System.out.println("The solution is all x!");
//             } else { // nếu b # c -> Phương trình vô nghiệm
//                 System.out.println("No solution!");
//             }
//         }
//     }
// }