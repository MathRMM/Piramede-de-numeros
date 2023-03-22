import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            String resp = "";
            for (int j = 0; j < i; j++){
                resp = resp + i;
            }
            System.out.println(resp);
        }
    }
}
