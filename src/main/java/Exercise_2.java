import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Insira um número:");
            String number = sc.next();

            int numberConverted = Integer.parseInt(number);

            System.out.println("Número convertido: " + numberConverted);
        }catch (NumberFormatException e ){
            System.err.println("Por favor, insira apenas números");
        }catch (NullPointerException e){
            System.err.println("Por favor, insira apenas números inteiros");
        }
    }
}
