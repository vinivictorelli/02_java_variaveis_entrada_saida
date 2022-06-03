import javax.swing.JOptionPane;

public class Ex5 {
    public static void main (String [] args){
        int base,altura,area;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retangulo:"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo:"));

        area = base * altura;

        JOptionPane.showMessageDialog(null,"A area do retangulo e " + area);
    }
}
