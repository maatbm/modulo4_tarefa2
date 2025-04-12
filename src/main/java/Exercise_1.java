import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Insira um número inteiro");
            int number1 = sc.nextInt();
            System.out.println("Insira outro número inteiro");
            int number2 = sc.nextInt();
            System.out.println("O resultado da divisão É: " + (number1/number2));
        }catch (ArithmeticException e){
            System.err.println("Não é possível fazer divisão por 0");
        }
    }
}
