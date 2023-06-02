import java.io.File;
import java.util.Scanner;

public class Main {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Nhập lựa chọn từ 1 đến 4");
         System.out.println("1 là ADDITION: ");
         System.out.println("2 là SUBTRACTION: ");
         System.out.println("3 là MULTIPLICATION: ");
         System.out.println("4 là DIVISION: ");
         int string= scanner.nextInt();
         if (string!=1 || string!=2 || string!=3 || string!=4)
         {
             System.out.println("Nhập lại lựa chọn");
             int strings= scanner.nextInt();
         }
         switch (string){
             case 1:
                 System.out.println(ADDITION);
             case 2:
                 System.out.println(SUBTRACTION);
             case 3:
                 System.out.println(MULTIPLICATION);
             case 4:
                 System.out.println(DIVISION);
         }
    }
}