import java.util.*;
public class calculator {
    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.println("1- Addition \n 2- subtraction \n 3- multiplication \n 4- division ");
        System.out.println("choose operator:");
        Scanner sc=new Scanner(System.in);
        operator =sc.nextInt();
        System.out.println("enter a first number:");
        n1=sc.nextInt();
        System.out.println("enter a second number:");
        n2=sc.nextInt();
        int result =0;
        switch (operator) {
            case 1 :
                result =n1 + n2;
                System.out.println("The ans is"+result);
                break;
            case 2 :
                result =n1 - n2;
                System.out.println("The ans is"+result);
                break;
            case 3 :
                result =n1 * n2;
                System.out.println("The ans is"+result);
                break;
            case 4 :
                result =n1 /n2;
                System.out.println("The ans is"+result);
                 break;
                    }
    }

}
