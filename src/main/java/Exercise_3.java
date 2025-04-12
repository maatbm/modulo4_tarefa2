import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Insira um número inteiro");
            String number = sc.next();
            int numberConverted = Integer.parseInt(number);
            System.out.println("Número convertido: " + numberConverted);
        }catch (NumberFormatException e){
            System.err.println("Insira apenas números: " + e.getMessage());
        }finally {
            System.out.println("O sistema se encerra aqui");
        }
    }
}
