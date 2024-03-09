import java.util.Scanner;

public class TATAEFOTA {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        String nome = "Tata";
        double valorDinheiro;
        String gasto;
        String resposta;

        // Solicita ao usuário que insira o valor que o Tata recebeu
        System.out.println("Qual o valor que o " + nome + " recebeu?");
        
        // Captura o valor do dinheiro como uma string
        String input = scanner.nextLine();
        
        // Converte a string em um número decimal
        valorDinheiro = Double.parseDouble(input);

        // Verifica o valor do dinheiro e determina o gasto correspondente
        if (valorDinheiro >= 50) {
            gasto = "Puta";
        } else if (valorDinheiro >= 20) {
            gasto = "Ropa";
        } else {
            gasto = "Tapato";
        }

        // Concatena a resposta
        resposta = "O Tata vai gastar " + valorDinheiro + "R$ com: " + gasto;

        // Imprime a resposta
        System.out.println(resposta);

        // Não se esqueça de fechar o scanner
        scanner.close();
    }
}