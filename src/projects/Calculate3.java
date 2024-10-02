package projects;
import java.util. Scanner;

public class Calculate3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o primeiro número: ");
       Double num1 = scanner.nextDouble();
       System.out.println("Digite o segundo número: ");
       Double num2 = scanner.nextDouble();
       char operator = scanner.next().charAt(0);
       scanner.close();
       double result;


       switch(operator){
           case '+':
               result = num1 + num2;
               break;
           case '-':
               result = num1 - num2;
               break;
           case '*':
               result = num1 * num2;
               break;
           case '/':
               result = num1 / num2;
               break;
           default:
               System.out.println("Operação invalida");
               return;
       }

       System.out.println(num1+" "+operator+" "+num2+": "+result);
    }
}
