import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        int chute = 0;

        while (tentativas <= 5) {
            System.out.println("Dê o seu palpite!");
            chute = scanner.nextInt();
            tentativas++;

            if (tentativas == 5) {
                System.out.println(
                    String.format("Você não acertou e já gastou todas as tentativas, sinto muito :c o número aleatório era %d", numeroAleatorio));
                break;
            }    else if (chute == numeroAleatorio) {
                System.out.println(String.format("Você acertou com %d tentativas! O número aleatório é %d.", 
                tentativas, numeroAleatorio));
                break;
            }    else if (chute > numeroAleatorio) {
                System.out.println("Seu chute foi maior do que o número aleatório");

            } else if (chute < numeroAleatorio) {
                System.out.println("Seu chute foi menor do que o número aleatório");

            }
        }
        scanner.close();

    }
}
