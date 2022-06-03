import java.util.Scanner;

public class Ex7 {
    public static void main(String [] args){
        int idadeEmAnos,IdadeEmDias,IdadeEmMeses;
        int idadeApenasEmDias;
        Scanner leitor;
        leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade(anos,meses,dias):");
        System.out.println("Anos:");
        idadeEmAnos = leitor.nextInt();
        System.out.println("Meses:");
        IdadeEmMeses = leitor.nextInt();
        System.out.println("Dias:");
        IdadeEmDias = leitor.nextInt();

        idadeApenasEmDias = (idadeEmAnos * 365)+(IdadeEmMeses*30)+IdadeEmDias;
        System.out.println(String.format("A sua idade em dias e %d",idadeApenasEmDias));
        leitor.close();
    }
}
