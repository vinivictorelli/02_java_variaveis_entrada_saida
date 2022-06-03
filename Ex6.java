import java.util.Scanner;

public class Ex6 {
    public static void main(String [] args){
        int idadeEmAnos,IdadeEmDias;
        Scanner leitor;
        leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade(anos):");
        idadeEmAnos = leitor.nextInt();

        IdadeEmDias = idadeEmAnos * 365;
        System.out.println(String.format("A sua idade em dias e %d",IdadeEmDias));
        leitor.close();
    }
}
