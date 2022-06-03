import java.util.Scanner;

public class Ex9 {
    public static void main(String [] args){
        double salario,reajuste,salarioReajustado;
        Scanner leitor;
        leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario:");
        salario = leitor.nextDouble();
        System.out.println("Digite a porcentagem do reajuste:");
        reajuste = leitor.nextDouble();

        salarioReajustado = salario + (salario * (reajuste/100));
        System.out.println(String.format("O seu salario com o reajuste e: %f",salarioReajustado));
        leitor.close();
    }
}
