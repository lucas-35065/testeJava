import java.util.Scanner;

public class LeituraComFor {
    public static void main(String[] args) {
        
        // Método para ler a entrada de dados
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Dê sua avaliação para o a Trilogia do Mochileiro das Galáxias");
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;
        }

        System.out.println(String.format("A nota média deste livro é %.2f", mediaAvaliacao/3));

        leitura.close();
    }
}
