import javax.swing.JOptionPane;

public class Ex1{
    public static void main(String [] args){
        //declaração de variaveis
        double cotacaoDolar;
        double quantidadeDolares;
        double valorConvertido;
        //entrada
        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação"));
        quantidadeDolares = Double.parseDouble(JOptionPane.showInputDialog("Digite a qauntidade de dolares"));
        //processamento
        valorConvertido = cotacaoDolar * quantidadeDolares;
        //saida
        JOptionPane.showMessageDialog(null,valorConvertido);        
    }
}