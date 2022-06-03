import javax.swing.JOptionPane;

public class Ex3 {
    static public void main(String [] args){
        double precoDaPeca;
        double quantidadeVendida;
        double comissao;

        precoDaPeca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça vendida:"));
        quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida"));

        comissao = precoDaPeca * quantidadeVendida * 0.05;

        JOptionPane.showMessageDialog(null,comissao);

        
    }
}
