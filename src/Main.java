import java.util.Scanner;
class Clcy
{
    public static void main (String args[]) {
        int operator, n1, n2;
        boolean flag = false;
        do {
            System.out.println("1=Additiom \n 2= Substraction \n 3=Multiply \n 4=Division \n 5=Exit");
            System.out.println("choose option:");
            Scanner sc=new Scanner(System.in);
            operator = sc.nextInt();

            int result=0;

            switch(operator){
                case 1:
                    System.out.println("enter first number:");
                    n1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    n2 =sc.nextInt();
                    result =n1+n2;
                    break;

                case 2:
                    System.out.println("enter first number:");
                    n1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    n2 =sc.nextInt();
                    result=n1-n2;
                    break;

                case 3:
                    System.out.println("enter first number:");
                    n1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    n2 =sc.nextInt();
                    result=n1*n2;
                    break;

                case 4:
                    System.out.println("enter first number:");
                    n1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    n2 =sc.nextInt();
                    result=n1/n2;
                    break;

                case 5:
                    flag = true;
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Entered operator is not valid");

            }
            System.out.println("result is:"+result);

        }while(!flag);
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
