import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String [] args){
        double valorTotalVendas,quantidadeVendida,salario,comissao,salarioFinal;

        valorTotalVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das vendas:"));
        quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite o quantidade de carros vendida:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor so salario:"));
        comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão fixa por venda:"));

        salarioFinal = (valorTotalVendas*0.05) + salario + (comissao*quantidadeVendida);
        System.out.println(String.format("O salario final do vendedor e %f\n",salarioFinal));

    }
}
