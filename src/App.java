import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);

        System.out.println("Digite um número:");
        int number = n.nextInt();

        System.out.println("Tabela de multiplicação de " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }   
}
