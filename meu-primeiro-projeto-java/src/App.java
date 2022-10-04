import java.util.Scanner;

public class App{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
String nome = sc.nextLine();
System.out.println("Bem vindo " + nome);

        sc.close();
    }
}