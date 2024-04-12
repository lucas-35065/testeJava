import java.util.Scanner;

public class LeituraComWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Dê sua avaliação para o App ou digite -1 para sair");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println(String.format("A nota média deste livro é %.2f", mediaAvaliacao/totalDeNotas));

        leitura.close();
    }
}
