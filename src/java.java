//import java.util.Scanner;

public class java {
    public static void main(String args[]){

   // Scanner number = new Scanner(System.in);
   // System.out.print ("enter the number  : ");
   // int Minuties = number.nextInt();

        int Minuties = 1300;

    int extraMin;
    double total;

    if ( Minuties > 1000 ){

        extraMin = Minuties - 1000;
        total = ( 300 * 1.25) + ( extraMin * 1.25);

    System.out.println(" additional minities is " + extraMin );
        System.out.print(" Total amount is " + total);

    }


    else
    {
        total = ( 300 * 1.25);
        System.out.println(" monthly rental  300 ");
        System.out.print(" total bill with tax " + total);

    }



    }




        }


