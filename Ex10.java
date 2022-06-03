import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String [] args){
        double custoDeFabrica,valorConsumidor;

        custoDeFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de fabrica:"));
        
        valorConsumidor = custoDeFabrica + (custoDeFabrica * 0.28) + (custoDeFabrica * 0.45);

        JOptionPane.showMessageDialog(null, String.format("O valor final para o consumidor e %f\n",valorConsumidor));
        
    }
}
