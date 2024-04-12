public class Condicionais {
    public static void main(String[] args) {
        int anoDeLançamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 1;
        String tipoDePlano = "Normal";

        if (anoDeLançamento >= 2024) {
            System.out.println("Filme de lançamento que a galera tá gostando.");
        } else {
            System.out.println("Filme retrô da galera");
        }
        
        if (notaDoFilme <= 5) {
            System.out.println("Filme furreca");
        } else if (notaDoFilme > 5 && notaDoFilme < 8 ) {
            System.out.println("Dá pra ver");
        } else {
            System.out.println("Filme Bão todo");
        }
        
        if (incluidoNoPlano || tipoDePlano.equals("Plus")) {
            System.out.println("Filme pode ser exibido");
        } else {
            System.out.println("Pague o aluguel.");
        }
    }
}
