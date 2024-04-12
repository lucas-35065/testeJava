import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu livro favorito");
        String livro = leitura.nextLine();

        System.out.println(livro);
    }
}
