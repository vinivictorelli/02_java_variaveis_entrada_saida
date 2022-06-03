import java.util.Scanner;

public class Ex2 {
    static public void main(String [] args){
        //variavel de referencia
        Scanner leitor;
        //objeto do tipo scanner
        leitor = new Scanner(System.in);
        //declaração de variaveis
        int numero1,numero2,numero3,numero4;
        int quadrado1,quadrado2,quadrado3,quadrado4;
        int somaQuadrados;
        //entrada
        System.out.println("Digite o primeiro numero");
        numero1 = leitor.nextInt();

        System.out.println("Digite o segundo numero");
        numero2 = leitor.nextInt();

        System.out.println("Digite o terceiro numero");
        numero3 = leitor.nextInt();

        System.out.println("Digite o quarto numero");
        numero4 = leitor.nextInt();

        //processamento
        quadrado1 = numero1 * numero1;
        quadrado2 = numero2 * numero2;
        quadrado3 = numero3 * numero3;
        quadrado4 = numero4 * numero4;

        somaQuadrados = quadrado1 + quadrado2 + quadrado3 + quadrado4;
        //saida
        System.out.println("Quadrado 1: " + quadrado1);
        System.out.println("Quadrado 2: " + quadrado2);
        System.out.printf("Quadrado 3: %d\n", quadrado3);
        System.out.println(String.format("Quadrado 4: %d",quadrado4));
        System.out.println("A soma dos quadrados é: " + somaQuadrados);
        leitor.close();
    }
}
