 import java.util.Scanner;
 public class Table
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();
        System.out.println("Do while loop");
        int i = 1;

        System.out.println("Multiplication Table of " + num + ":");

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
        System.out.println("While loop");
         i=1;
          while (i<=10){
              System.out.println(num + " x " + i + " = " + (num * i));
              i++;
          }
          System.out.println("For loop");
          for ( i=1;i<=10;i++){
              System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

