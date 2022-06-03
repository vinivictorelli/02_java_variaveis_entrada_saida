import java.util.Scanner;

public class Ex4 {
    public static void main(String [] args){
        int numero, antecessor;
        Scanner leitor;
        leitor = new Scanner(System.in);

        System.out.println("Digite um numero qualquer:");
        numero = leitor.nextInt();

        antecessor = numero - 1;
        System.out.println(String.format("O antecessor do numero e: %d\n",antecessor));
        leitor.close();

    }
}
