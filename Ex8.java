import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String [] args){
        double numTotalEleitores,votosBrancos,votosNulos,votosValidos;
        double porcentagemVotosBrancos,porcentagemVotosNulos,porcentagemVotosValidos;

        numTotalEleitores = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero total de eleitores:"));
        votosBrancos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero total de votos brancos:"));
        votosNulos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero total de votos nulos:"));
        votosValidos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero total de votos validos:"));

        porcentagemVotosBrancos = (votosBrancos/numTotalEleitores) * 100;
        porcentagemVotosNulos = (votosNulos/numTotalEleitores) * 100;
        porcentagemVotosValidos = (votosValidos/numTotalEleitores) * 100;

        JOptionPane.showMessageDialog(null, String.format("a porcentagem de votos em Branco e %f",porcentagemVotosBrancos));
        JOptionPane.showMessageDialog(null, String.format("a porcentagem de votos nulos e %f",porcentagemVotosNulos));
        JOptionPane.showMessageDialog(null, String.format("a porcentagem de votos validos e %f",porcentagemVotosValidos));
    }
}
