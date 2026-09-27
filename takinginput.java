import java.util.Scanner;
public class takinginput {
     public static void main(String[] args) {
        System.out.println("IT WORKS!");
    Scanner sc = new Scanner(System.in); // (naya object bna ke apne hisab se use krne ke liye  )
    // System.out.println("Enter number 1 ");
    // // int a = sc.nextInt();
    // float a = sc.nextFloat();
    // System.out.println("Enter number 2");
    // // int b = sc.nextInt();
    // float b = sc.nextInt();
    // // int sum = a+b;
    //  float sum = a+b;
    // System.out.println("The sum of these number is : " +sum);
// boolean b1  = sc.hasNextInt();  // (to check the no.is int or not)
// System.out.println(b1);
// String str = sc.next();  // only first word print krega bcz of next.
String str = sc.nextLine(); // full sentence ko print krvayga.
System.out.println(str);
}}

