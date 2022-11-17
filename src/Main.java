import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a Value: ");
      int x= input.nextInt();

      /*  if (x>=90) {
            System.out.print("You got A+");
        } else if ((x>=80) && (x<90)){
            System.out.print("You got A");
        }else if ((x>=70) && (x<80)) {
            System.out.print("You got A-");
        }else if ((x>=60) && (x<70)) {
            System.out.print("You got B+");
        }else if ((x>=50) && (x<60)) {
            System.out.print("You got B");
        }else if ((x>=40) && (x<=50)) {
            System.out.print("You got C");
        } else
            System.out.print("You are fail");
        */


  switch(x){

        case 90:
              System.out.print("You got : (A+)");
                                             break;

          case 80:
              System.out.print("You got : (A)");
                                            break;

          case 70:
              System.out.print("You got : (A-)");
                                            break;

          case 60:
              System.out.print("You got : (B+)");
                                            break;

          case 50:
              System.out.print("You got : (B)");
                                            break;

          case 40:
              System.out.print("You got : (C)");
                                            break;

          default:
               System.out.print("You are fail");
                                              break;

        }
    }
}
